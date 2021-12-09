class Employee
{
int empno;
String name;
//creating constructor
public Employee()
{
empno=123;
name="rasi";
}

}

class Test21
{
public static void main(String[] arg)
{
Employee emp=new Employee();
System.out.println("Empno " + emp.empno);
System.out.println("Empname " + emp.name);
}

}