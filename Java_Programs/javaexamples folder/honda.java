//example of overriding

class Vehicle
{
void run(){System.out.println("Vehicle is running");}
}
class Bike extends Vehicle
{
void run(){System.out.println("Bike is running safely");}
}
class Car extends Vehicle
{
void run(){System.out.println("car is running");}
}
class honda
{
public static void main(String []args)
{
Bike obj=new Bike();
obj.run();//call method
Car obj1=new Car();
obj1.run();//call the method of child class
}
}
