


interface printable{
void print();
interface MessagePrintable{
void msg();
}
}

class example implements printable.MessagePrintable
{
public void print()
{
System.out.println("print");

}

public void msg()
{
System.out.println("msg");

}
}
class defmeth1
{
public static void main(String[] arg)
{
example e=new example();
e.msg();
e.print();

}
}