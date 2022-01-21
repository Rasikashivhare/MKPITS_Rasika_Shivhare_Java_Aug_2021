interface interone
{
void dis();
}

class one1
{
public static void name()
{
System.out.println("static method body");
}
}

public class medref1
{
public static void main(String[] args)
{
//interone ob=()->System.out.println("my interface");
//ob.dis();

interone ob=one1::name;
ob.dis();
}
}
