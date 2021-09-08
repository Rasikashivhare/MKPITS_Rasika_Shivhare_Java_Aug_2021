//wap to accept length and breadht of rectangle and then print area of rectangle
import java.util.*;
class Simple4
{
public static void main(String []abc )
{
int length,breadth;

Scanner s=new Scanner(System.in);
System.out.println("enter length ");
length=s.nextInt();
System.out.println("enter breadth");
breadth=s.nextInt();
int area=length*breadth;
System.out.println("area : " + area);
}
}