//create a parent class person having fields name address then create a inherited class student having new fields rno and marks

class person
{
String name;
String address;
}
//create inherited class student
class student extends person
{
int rno ;
int marks;
}

class inh1
{
public static void main(String []arg)
{
student s1=new student();
s1.rno=12;
s1.name="rashu";
s1.address="nagpur";
s1.marks=56;
System.out.println("rno"+ s1.rno);
System.out.println("name"+ s1.name);
System.out.println("address"+ s1.address);
System.out.println("marks"+s1.marks);
}
}



