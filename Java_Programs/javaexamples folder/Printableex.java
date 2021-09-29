//example of abstract

interface printable 
{
int MIN=5;
void print();
}
public class Printableex implements printable{
public void print() 
{
System.out.println("min " + MIN);
}
public static void main(String[] args) {
printable p=new Printableex();
p.print();
}
}