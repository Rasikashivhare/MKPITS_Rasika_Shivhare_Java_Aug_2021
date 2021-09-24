// program by accepting values from the user
//creating parent class person

class person
{
String name;
String address;
void insertpersondata(String name,String address) 
{
this.name=name;

this.address=address;
}
void displaypersondata() {

System.out.println("name " + name);
System.out.println("address " + address);

}
}

class employee extends person
{
int empno;
int salary;
void insertemployeedata(int empno,int salary) {
this.empno=empno;
this.salary=salary;
}
void displayemployeedata()
{

System.out.println("empno " + empno);

System.out.println("salary " + salary);

}
}

class parttimeemployee extends employee
{
int hours;
void insertparttimeemployeedata(int hours) {
this.hours=hours;
}
void displayparttimeemployeedata() {

System.out.println("hours " + hours);

}
}

class inh6
{
public static void main(String[] arg)
{
parttimeemployee s1=new parttimeemployee();
java.util.Scanner scan=new java.util.Scanner(System.in);
System.out.println("enter empname");
String empname=scan.next();
System.out.println("enter emp address ");
String empaddress=scan.next();
s1.insertpersondata(empname,empaddress);
System.out.println("enter empno");
int empno=scan.nextInt();
System.out.println("enter emp salary");
int salary=scan.nextInt();
s1.insertemployeedata(empno,salary);
System.out.println("enter emp working hours");
int hours=scan.nextInt();
s1.insertparttimeemployeedata(hours);
s1.displaypersondata();
s1.displayemployeedata();
s1.displayparttimeemployeedata();
}

}