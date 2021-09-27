//Assign and print the roll_no ,phone_numberand address of two students having names"Sam" and "John" by creating two objects of class "Student"

class Address
{
String city;
String state;
String country;
Address(String city,String state,String country)
{
this.city=city;
this.state=state;
this.country=country;
}
}

class Student
{
int roll_no;
 long phone_no;
 Address address;
 Student(int roll_no,long phone_no,Address address)
 {
 this.roll_no=roll_no;
 this.phone_no=phone_no;
 this.address=address;
 }

 void display()
 {

    System.out.println("roll_no="+roll_no);
        System.out.println("phone_no="+phone_no);
    System.out.println("address="+address.city);
        System.out.println("address="+address.state);
    System.out.println("address="+address.country);
    }
    }
    class Ass_Student_3{
    public static void main(String []args)
    {
    Address add=new Address("nagpur","Maharashtra","India");
    System.out.println("Student name:Sam");
    Student s1=new Student(05,930998,add);
    s1.display();
        System.out.println("Student name:John");
            Student s2=new Student(05,9309,add);
            s2.display();
            }
            }








