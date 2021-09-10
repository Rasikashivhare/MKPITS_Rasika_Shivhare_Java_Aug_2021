//wap to accept 3 subject marks and then print total,percentage
import java.util.*;
class total_percentage
{
public static void main(String arg[])
{
int s1,s2,s3,total;
float percentage;
Scanner s=new Scanner(System.in);
System.out.println("enter marks of first subject");
s1=s.nextInt();
System.out.println("enter marks of second subject");
s2=s.nextInt();
System.out.println("enter marks of third subject");
s3=s.nextInt();
total=s1+s2+s3;
percentage=(float)(total/300.0f)*100;
System.out.println("Total Marks:"+ total);
System.out.println("percentage:"+ percentage);
}
}