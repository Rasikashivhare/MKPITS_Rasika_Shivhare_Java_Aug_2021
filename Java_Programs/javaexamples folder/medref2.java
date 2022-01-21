interface interone
{
void dis();
}

class one1
{
public static void name()
{
System.out.println("static method body");
System.out.println("two");
System.out.println("three");


}
}

public class medref2
{
public static void main(String[] args)
{
//interone ob=()->System.out.println("my interface");
//ob.dis();

interone ob=one1::name;
ob.dis();
}
}
