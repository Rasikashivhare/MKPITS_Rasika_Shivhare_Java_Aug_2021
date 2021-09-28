
//example of polymorphism

class parent
{
void display()
{
System.out.println("hello from parent class mthod");
}
}
class child extends parent
{
//overriding base class display method
void display()
{
System.out.println("hello from child class display method");
}
}
class rtp
{
public static void main(String []args)
{
parent c;//c is reference variable of super class parent
c=new child();
c.display();
}
}
