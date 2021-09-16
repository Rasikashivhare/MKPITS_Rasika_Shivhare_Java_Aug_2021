class Employee
{
int empno;
String name;
}
class Employee_emp
{
public static void main(String []arg)
{
//every time an object is creted usingnew keyword,atleast one constructor
Employee emp=new Employee();
System.out.println("Empno"+emp.empno);
System.out.println("Empname"+emp.name);
}
}