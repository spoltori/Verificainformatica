import java.util.Scanner;
public static void Main(String[] args){
    Scanner scanner=new Scanner(System.in);
Coda coda=new Coda();
System.out.println("inserire 3 elementi da mettere in coda")
for(int i=0;i<3;i++){
    System.out.println("inserire l'elemento n: "+i);
    n1=scanner.nextInt();
    coda.enqueue(n1);
}
System.out.println("i 3 elementi sono stati inseriti");
coda.dequeue();
coda.dequeue();
coda.toString();
}