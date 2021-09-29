interface printable
{
void print();
interface MessagePrintable
{
void msg();
}
}

abstract class example implements printable.MessagePrintable
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

class defmeth extends example
{
public static void main(String[] arg)
{
example e=new defmeth();
e.msg();
e.print();

}
}