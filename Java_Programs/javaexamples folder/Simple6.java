//wap to accept 3 subject marks and then print total marks
import java.util.*;
class Simple6
{
public static void main(String []abc )
{
int n1,n2,n3;

Scanner s=new Scanner(System.in);
System.out.println("enter n1 ");
n1=s.nextInt();
System.out.println("enter n2");
n2=s.nextInt();
System.out.println("enter n3");
n3=s.nextInt();

int totalmarks=n1+n2+n3;
System.out.println("totalmarks: " + totalmarks);
}
}