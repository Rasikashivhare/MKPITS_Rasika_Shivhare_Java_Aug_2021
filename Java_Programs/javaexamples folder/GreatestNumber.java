//wap to accept 3 no and print greatest
import java.util.Scanner;
  class GreatestNumber
{
public static void main(String args[])
{
int n1,n2,n3;
Scanner s=new Scanner(System.in);
System.out.println("Enter first number:");
n1=s.nextInt();
System.out.println("Enter second number:");
n2=s.nextInt();
System.out.println("Enter second number:");
n3=s.nextInt();
if(n1>n2 && n1>n3)
{
System.out.println(" Largest number is:"+n1);
}
else if(n2>n3)
{
System.out.println(" Largest number is:"+n2);
}
else
{
System.out.println("Largest number is:"+n3);
}
}
}