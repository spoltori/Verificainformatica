public class Nodo {
    public Nodo link;
    public int num; 

public Nodo (int n) {
	num = n;
	link = null; 
}

public Nodo (int n, Nodo next){
    this.num=n;
    this.link= next;
}

public int getNum() {
	return num;
    
}

public void setLink(Nodo link) {
	this.link = link ;
}

public Nodo getLink() { 
	return link;
}
@Override
    public String toString(){
        String q = "[";
        if(link!=null)
            return q+num+"]"+link;
        else
            return q+num+"]"+null;
}
}