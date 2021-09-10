//wap to accept empno,empname and salary and then print hra,da ,total salary

import java.util.*;
class total_salary
{
public static void main(String arg[])
{
int empno,salary;
float hra,da,total_salary;
String empname;
Scanner s=new Scanner(System.in);
System.out.println("enter employee number");
empno=s.nextInt();
System.out.println("enter salary");
salary=s.nextInt();
System.out.println("enter employee name");
empname=s.nextInt();
hra=(float)(salary*0.20f);
da=(float)(salary*0.10f);
total_salary=hra+da+salary;
System.out.println("HRA:"+ hra);
System.out.println("Total salary:"+total_salary);
}
}