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
        

public void printList() {
    Nodo nodo= testa;
   while(nodo!=null) { 
        System.out.println("Nodo: "+Integer.toString(nodo.num));
        nodo=nodo.getLink();
    } 
}
public int cercaMassimo(){
    int max=testa.getNum();
    Nodo p=testa;
    while(p.getLink()!=null){
        if(max<p.getNum()){
            max=p.getNum();
         }
         p= p.getLink();
        }
        return max;
}

}
