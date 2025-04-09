//Es1. Trovare il numero massimo in una lista di 10 numeri interi. 
// Creare un nuovo nodo in testa alla lista contenete il valore massimo trovato.
//  Stampare la lista prima e dopo l'inserimento del massimo.

public class Main {

    public static void main(String[] args) {

        int max=0;
        Lista l = new Lista();
        l.add(1);
        l.add(3);
        l.add(9);
        l.add(5);
        
        System.out.println("Lista originale:");
        l.printList();
        
//siccome il massimo deve essere essere in testa allora il nodo che sto creando deve puntare alla testa con il setLink;

        l.add(l.cercaMassimo());
        Nodo nuovo = new Nodo(l.cercaMassimo());
nuovo.setLink(l.getTesta());
l.setTesta(nuovo);

        
        System.out.println("Lista aggiornata");
        l.printList();
	}

}