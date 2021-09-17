create a package mkpits1 and a class Employee having fields empno,empname, basicsalary
create method insert , calculateBonus, display .
package mkpits1;
public class Employee {
int empno;
String empname;
int basicsalary;

float bonus;
public void insert(int e,String en,int b) {
empno=e;
empname=en;
basicsalary=b;
}
public void calculateBonus()
{
bonus=basicsalary * 0.65f;
}
public void display()
{
System.out.println("empno " + empno);
System.out.println("empname " + empname);
System.out.println("basicsalary " + basicsalary);
System.out.println("bonus " + bonus);

}
}