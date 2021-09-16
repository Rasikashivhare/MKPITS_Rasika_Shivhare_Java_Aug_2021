//example of private java access modifier
  class Bike_1
{
private int speed;
//creating a default constructor
Bike_1()
{
System.out.println("Bike is created");
speed=100;
}
  void display()
{
System.out.println("speed of bike is"+speed);
}
}
class testbike2{
public static void main(String args[])
{
Bike_1 b=new Bike_1();
//b.speed=20;//error since speed is declared private
b.display();
}
}
