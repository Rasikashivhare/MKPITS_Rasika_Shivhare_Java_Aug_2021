//wap to accept age and print whhether he is minor ,young or old

import java.util.*;
class AgeMinor
{
public static void main(String arg[])
{
int age;
Scanner s=new Scanner(System.in);
System.out.println("Enter age of a person");
 age=s.nextInt();
if(age<18)
{
System.out.println("You are minor");
}
else if(age>=18 && age<40)
{
System.out.println("You are young");
}
else
{
System.out.println("You are old");
}
}
}