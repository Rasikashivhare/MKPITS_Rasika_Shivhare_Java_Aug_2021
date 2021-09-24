//example of multilevel inheritance
//create a class person,then create a class student inherited from person class,then create a class parttimeemployee inherited from student class

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
class student extends person
{
int rno;
int marks;
void insertstudentdata(int rno,int marks)
{
this.rno=rno;
this.marks=marks;
}
void displaystudentdata()
{
System.out.println("rno" +rno);
System.out.println("marks" +marks);
}
}

class parttimestudent extends student
{
int hours;
void insertparttimestudent(int hours)
{
this.hours=hours;
}
void displayparttimestudentdata()
{
System.out.println("hours" +hours);
}
}

class inh7
{
public static void main(String[] args)
{
parttimestudent p1=new parttimestudent();
p1.insertpersondata("rasi","nagpur");
p1.insertstudentdata(12,80);
p1.insertparttimestudent(4);
p1.displaypersondata();
p1.displaystudentdata();
p1.displayparttimestudentdata();
}
}
