class Employee
{

int empno;
String name;

}
class Test22
{

public static void main(String[] arg) 
{

Employee emp=new Employee();//It calls a default constructor 
System.out.println("Empno " + emp.empno); 
System.out.println("Empname " + emp.name); 
}

}