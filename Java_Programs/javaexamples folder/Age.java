
//wap to accept age and print whether he is eligible to vote or not

import java.util.Scanner;
class Age
{
public static void main(String arg[])
{
int age;
Scanner s=new Scanner(System.in);
System.out.println("Enter age of a person");
age=s.nextInt();
if(age>=18)
{
System.out.println("You are eligible to vote");
}
else
{
System.out.println("You are not eligible to vote");
}
}
}