//example of parameterized constructor of student class
class Student4

{
int id;
String name;
Student4(int i,String n)
{
id=i;
name=n;
}
void display(){System.out.println("id"+name);}


public static void main(String [] arg)
{
Student4 s1=new Student4(123,"sonu");
s1.display();
Student4 s2=new Student4(222,"rasikashivhare");
s2.display();
}
}
