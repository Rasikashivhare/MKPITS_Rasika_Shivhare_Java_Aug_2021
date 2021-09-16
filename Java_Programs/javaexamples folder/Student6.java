//Example of Constructor Overloading
//Java Program to demonstrate the use of the parameterized constructor.

class Student6{
int id;
String name;
//creating a parameterized constructor
Student6(int i){
id = i;

}
//constructor overloading
Student6(int i,String n){
id = i;
name = n;
}
//method to display the values
void display(){System.out.println(id+" "+name);}

public static void main(String args[]){
//creating objects and passing values
Student6 s1 = new Student6(111);
Student6 s2 = new Student6(222,"Aryan");
//calling method to display the values of object
s1.display();
s2.display();
}
}