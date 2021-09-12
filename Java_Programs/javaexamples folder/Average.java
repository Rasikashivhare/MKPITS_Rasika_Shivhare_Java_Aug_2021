//wap to accept 3 number and then print total and average
import java.util.*;
class Average
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

int total=n1+n2+n3;
int average=total/3;
System.out.println("total: " + total);
System.out.println("average :"+ average);
}
}