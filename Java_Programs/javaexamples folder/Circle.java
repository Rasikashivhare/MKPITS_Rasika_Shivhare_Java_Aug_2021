//wap to accept radius of a circle and print area and circ of circle
import java.util.*;
class Circle
{
public static void main(String []abc)
{
int radius;
float area,circ,pi=3.14f;

Scanner s=new Scanner(System.in);
System.out.println("enter radius ");
area=pi*radius*radius;
circ=2*pi*radius;
System.out.println("area : " + area);
System.out.println("circ:" + circ);
}
}