//wap to accept 2 no and print greater no .

import java.util.*;
class Greater
{
public static void main(String arg[])
{
int num1,num2;
Scanner s =new Scanner(System.in);
System.out.println("Enter two numbers");
num1=s.nextInt();
num2=s.nextInt();
if(num1>num2)
{
System.out.println("First number is greater than second number");
}
else if(num2>num1)
{
System.out.println("Second number is greater than first number");
}
else
{
System.out.println("Both are equal");
}
}
}
