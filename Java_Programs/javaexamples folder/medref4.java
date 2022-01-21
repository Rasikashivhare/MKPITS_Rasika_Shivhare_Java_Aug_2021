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

class two1
{
public void name2()
{
System.out.println(" without static method body");
}
}

class three1
{
public three1()
{
System.out.println("my constructor");
}
}


public class medref4
{
public static void main(String[] args)
{
//interone ob=()->System.out.println("my interface");
//ob.dis();
two1 ob1=new two1();
interone ob=three1::new;// constructor reference method
ob.dis();
}
}
