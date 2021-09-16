//example of employee class with constructor and method
class EmployeeClass
{
int empno;
String name;
//crete constructor(default constructor(no arg constructor)
public Employee()
{
System.out.println("default constructor called");
empno=123;
name="rasika";
}
//create method 
public void display()
{
System.out.println("Empno"+empno);
System.out.println("Empname"+name);
}
}
class Test
{
public static void main(String arg[])
{
Employee emp=new Employee();
emp.display();
}
}