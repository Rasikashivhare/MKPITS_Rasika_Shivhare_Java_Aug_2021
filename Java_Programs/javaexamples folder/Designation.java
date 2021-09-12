//wap to accept basicsalary and designation like m for manager,c for clerk and p for peon and cal bonus=1000 for m ,500 for c 100 for p
//and display basicsalary,bonus and total salary
import java.util.Scanner;
class Designation
{
public static void main(String arg[])
{
int basicsalary,bonus=0,total=0;
char designation;
Scanner s=new Scanner(System.in);
System.out.println("Enter basicsalary");
basicsalary=s.nextInt();
System.out.println("Enter designation like m,c,p");
designation=s.next().charAt(0);
total=basicsalary+bonus;
if (designation=='m')
{
bonus=1000;
} else if (designation=='c')
{
bonus=500;
}
 else if(designation=='p')
{
bonus=100;
}
System.out.println("bonus=" +bonus);
}
}
