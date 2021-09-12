//wap to accept a number from the user and then print the multiplication of a number.
import java.util.*;
class Multiplication
{
public static void main(String []abc )
{
int num;

Scanner s=new Scanner(System.in);//s is object of scanner class
System.out.println("enter number");
num=s.nextInt(); // nextInt() is a method in scanner class to accept integer value
int multiplication=num*num;
System.out.println("multiplication : " + multiplication);
}
}