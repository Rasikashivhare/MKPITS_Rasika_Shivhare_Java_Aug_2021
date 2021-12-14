//object and class example :initialization through method
class Student
{
int rollno;
String name;
void insertRecord(int r,String n)
{
rollno=r;
name=n;
}
void displayInformation(){System.out.println(rollno+""+name);}
}
class TestStudent15
{
public static void main(String[] args)
{
Student s1=new Student();
Student s2=new Student();
s1.insertRecord(111,"rasika");
s2.insertRecord(123,"shubu");
s1.displayInformation();
s2.displayInformation();
}
}
