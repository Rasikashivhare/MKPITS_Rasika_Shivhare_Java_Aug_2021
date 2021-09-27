//example of overriding
class calculate
{
int addition(int n1,int n2)
{
return n1+n2;
}
int addition(int n1,int n2,int n3)
{
return ( n1+ n2+ n3);
}
}
public class overex
{
public static void main(String []args)
{
calculate cal=new calculate();
int res=cal.addition(2,3);
System.out.println("addition of 2 no "+res);
res=cal.addition(2,3,4);
System.out.println("addition of 3 no "+res);
}
}


