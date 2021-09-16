//example of private java access modifier
class Bike2
{
private int speed;
//creating a default constructor
Bike2
()
{
System.out.println("Bike is created");
speed=100;
}
void display()
{
System.out.println("speed of bike is"+speed);
}
}
class testbike1{
public static void main(String args[])
{
Bike2 b=new Bike2();
//b.speed=20;//error since speed is declared private
b.display();
}
}
