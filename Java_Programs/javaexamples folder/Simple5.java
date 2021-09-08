//wap to accept length and breadht ,height  and then print volume
import java.util.*;
class Simple5
{
public static void main(String []abc )
{
int length,breadth,height;

Scanner s=new Scanner(System.in);
System.out.println("enter length ");
length=s.nextInt();
System.out.println("enter breadth");
breadth=s.nextInt();
System.out.println("enter height");
height=s.nextInt();

int volume=length*breadth*height;
System.out.println("volume : " + volume);
}
}