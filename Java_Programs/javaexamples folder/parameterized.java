//example of parameterized constructor
class Employee

{
int empno;
String name;
public Employee()
{
System.out.println("default constructor called");
empno=123;
name="rasika";
}
public Employee(int e,String n)
{
empno=e;
name=n;
}
public void display()
{
System.out.println("Empno"+empno);
System.out.println("Empname"+ name);
}
}
class parameterized
{
public static void main(String [] arg)
{
Employee emp=new Employee();
emp.display();
Employee emp1=new Employee(111,"rasikashivhare");
emp1.display();
}
}
