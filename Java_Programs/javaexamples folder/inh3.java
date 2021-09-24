//create a class person and then create a child class employee

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
System.out.println("address" + address);
}
}

//create inherited class
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
System.out.println("empno" + empno);
System.out.println("salary" + salary);
}
}

class inh3
{
public static void main(String []args)
{
employee e1=new employee();
e1.insertpersondata("rasishubu","nagpur");
e1.insertemployeedata(123,20000);
e1.displaypersondata();
e1.displayemployeedata();
}
}

