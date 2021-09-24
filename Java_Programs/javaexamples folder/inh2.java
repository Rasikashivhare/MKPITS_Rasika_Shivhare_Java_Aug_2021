//example of single inheritance
//create a parent class person  and then create child class student
//create parent class

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
System.out.println("name" + name);
System.out.println("address" + address);
}
}

//create inherited class student

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
System.out.println("rno" + rno);
System.out.println("marks" + marks);
}
}


class inh2
{
public static void main(String[] arg)
{
student s1=new student();
s1.insertpersondata("rasishubu","nagpur");
s1.insertstudentdata(11,99);
s1.displaypersondata();
s1.displaystudentdata();
}
}


