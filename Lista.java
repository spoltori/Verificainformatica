public class Lista{

    public Nodo testa;
    public int size;

public Lista() {
    size = 0;
    testa = null;
}

public int getSize(){
    return size;
}

public Nodo getTesta(){
    return testa;
}

public void setTesta(Nodo link){
    testa=link;
}

public void add(int n) {
    Nodo nuovo = new Nodo(n);
    nuovo.num = n;
    if (testa==null)
    {
        nuovo.setLink(testa); 
        testa=nuovo; 
        size++;
    }
    else{
        if (testa.link==null) {
            nuovo.setLink(null);
            testa.setLink(nuovo);
            size++;
            }
        else { 
            Nodo p = testa;
            while (p.getLink() != null) {
                p = p.getLink();
            }
            nuovo.setLink(null);
            p.setLink(nuovo);
            size++;
            System.out.println("Dimensione della lista: "+size);
            }
    }
}
        
public void remove(int value) {
    if (testa == null) {
        System.out.println("Lista vuota, impossibile rimuovere.");
        return;
    }

    // Se il nodo da rimuovere è il primo della lista
    if (testa.getNum() == value) {
        testa = testa.getLink();
        return;
    }

    // Cerca il nodo da eliminare e aggiorna il riferimento del precedente
    Nodo current = testa;
    Nodo previous = null;

    while (current != null && current.getNum() != value) {
        previous = current;
        current = current.getLink();
    }

    // Se il nodo è stato trovato, aggiorna il collegamento
    if (current != null) {
        previous.setLink(current.getLink());
    } else {
        System.out.println("Elemento " + value + " non trovato.");
    }
}


public void printList() {
    Nodo nodo= testa;
   while(nodo!=null) { 
        System.out.println("Nodo: "+Integer.toString(nodo.num));
        nodo=nodo.getLink();
    } 
}

}