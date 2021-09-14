//create a class employee having empno,empname,designation and salary//create a class product and create 2 objects
class Employee
{
int empno;//fields
String empName;
float empsalary;
}
class TestEmployee1
{
public static void main(String arg[])
{
//create an object
Employee e1=new Employee();
e1.empno=110;
e1.empName="maggie";
e1.empsalary=20000;
//print values of an object
System.out.println("empno="+e1.empno);
System.out.println("empname="+e1.empName);
System.out.println("empsalary="+e1.empsalary);
//create an object
Employee e2=new Employee();

e2.empno=100;
e2.empName="sita";
e2.empsalary=1200;

//print values of an object
System.out.println("empno="+e2.empno);
System.out.println("empname="+e2.empName);
System.out.println("empsalary="+e2.empsalary);
}
}