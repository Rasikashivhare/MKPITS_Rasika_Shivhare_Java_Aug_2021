//example of multilevel inheritance
//create a class person,then create a class employee inherited from person class,then create a class parttimeemployee inherited from employee class

class person
{
String name;
String address;
void insertpersondata(String name,String address)
{
this.name=name;
this.address=address;
}
void displaypersondata()
{
System.out.println("name" +name);
System.out.println("address" +address);
}
}
class employee extends person
{
int empno;
int salary;
void insertemployeedata(int empno,int salary)
{
this.empno=empno;
this.salary=salary;
}
void displayemployeedata()
{
System.out.println("empno" +empno);
System.out.println("salary" +salary);
}
}

class parttimeemployee extends employee
{
int hours;
void insertparttimeemployee(int hours)
{
this.hours=hours;
}
void displayparttimeemployeedata()
{
System.out.println("hours" +hours);
}
}

class inh5
{
public static void main(String[] args)
{
parttimeemployee p1=new parttimeemployee();
p1.insertpersondata("rasi","nagpur");
p1.insertemployeedata(12,8000);
p1.insertparttimeemployee(4);
p1.displaypersondata();
p1.displayemployeedata();
p1.displayparttimeemployeedata();
}
}
