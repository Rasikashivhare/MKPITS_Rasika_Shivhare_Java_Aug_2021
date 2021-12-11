class person
{
String name;
String address;
}
//creating inherited class student
class student extends person
{
int rno;
int marks;
}
class inheritnce
{
public static void main(String[] arg)
{
student s1=new student();
s1.rno=11;
s1.name="rasi";
s1.address="nagpur";
s1.marks=98;
System.out.println("rno" + s1.rno);
System.out.println("name" + s1.name);
System.out.println("address" + s1.address);
System.out.println("marks" + s1.marks);
}
}




