public class Coda {
private Nodo pTesta; // puntatore alla testa
private Nodo pCoda; //puntatore alla coda
public Coda(){
pTesta = null;
pCoda = null;
}
public void enqueue(int elemento){
if(isEmpty()){
pTesta = new Nodo(elemento, pTesta);
pCoda = pTesta;
}
else{
pCoda.link = new Nodo(elemento,null);
pCoda = pCoda.link;
}
}
public int dequeue(){
if (isEmpty())
return (-1);
int top = pTesta.getNum();
pTesta = pTesta.getLink();
return top;
}
public boolean isEmpty(){
return pTesta == null;
} 
@Override
public String toString(){
if (pTesta ==null)
return "[]->null";
else
return "[]->"+ pTesta + "";
}
}