//example for accepting student details from user using Scanner class.
import java.io.*;
import java.util.*;
class Student implements Serializable
{
int id;
String name;
transient int age;
public Student(int id, String name,int age) {
this.id = id;
this.name = name;
this.age=age;
}
}
class PersistExample1
{
public static void main(String args[])throws Exception{
Scanner scan=new Scanner(System.in);
System.out.println("enter student id ");
int id=scan.nextInt();
System.out.println("enter student name ");
String name=scan.next();
System.out.println("enter student age ");
int age=scan.nextInt();

Student s1 =new Student(id,name,age);
//writing object into file
FileOutputStream f=new FileOutputStream("f.txt");
ObjectOutputStream out=new ObjectOutputStream(f);
out.writeObject(s1);
out.flush();
out.close();
f.close();
System.out.println("success");

FileInputStream fos=new FileInputStream("f.txt");

ObjectInputStream oos=new ObjectInputStream(fos);
Student s11=(Student)oos.readObject(); //deserialization
fos.close();
System.out.println("id " + s11.id);
System.out.println("name " + s11.name);
System.out.println("age " + s11.age);

}
}