//wap to accept a number from the user and then print the square of a number.
import java.util.*;//java is package, util is subpackage
class Simple2
{
public static void main(String []abc )
{
int num;

Scanner s=new Scanner(System.in);//s is object of scanner class
System.out.println("enter number");
num=s.nextInt(); // nextInt() is a method in scanner class to accept integer value
int square=num*num;
System.out.println("square : " + square);
}
}