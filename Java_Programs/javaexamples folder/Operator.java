//wap to accept 2 no and operator like +,-,* and display the result
import java.util.Scanner;
class Operator
{
public static void main(String arg[])
{
int n1,n2;
float result=0.0f;
char operator;
Scanner s=new Scanner(System.in);
System.out.println("Enter n1");
n1=s.nextInt();
System.out.println("Enter n2");

n2=s.nextInt();
System.out.println("Enter operator like( +,-,*)");
operator=s.next().charAt(0);


if (operator=='+')
{
result=n1+n2;
} else if (operator=='-')
{
	result=n1-n2;
}
else if (operator=='*')
{
	result=n1*n2;
}
System.out.println("Result=" +result);
}
}
