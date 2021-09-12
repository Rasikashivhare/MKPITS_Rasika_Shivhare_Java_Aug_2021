
//wap to accept 3 no and print the smallest no

import java.util.Scanner;
class SmallestNum3
{
public static void main (String args[])
{
int num1,num2,num3;
Scanner s=new Scanner(System.in);

System.out.print("Enter the first number\n");
 num1=s.nextInt();
System.out.print("Enter the second number\n");
num2=s.nextInt();
System.out.print("Enter the Third number\n");
 num3=s.nextInt();


    if(num1<=num2 &&num1<=num3)
    {

        System.out.println(num1+" is the smallest number");

    }
    else{

    if(num2<=num3)
        System.out.println(num2+" is the smallest number");

    else
        System.out.println(num3+" is the smallest number");
    }

}
}