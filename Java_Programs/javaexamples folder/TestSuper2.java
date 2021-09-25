//example of super keyword

class Animal
{
String color="white";
}
class Dog extends Animal
{
String color="black";
void printColor()
{
	System.out.println(super.color);

}
}
class BabyDog extends Dog
{
String color ="brown";
void printColor1()
{
System.out.println(color);//print color of dog class
System.out.println(super.color);//print color of Animal
 printColor();
 }
 }
 class TestSuper2
 {
 public static void main(String args[])
 {
 BabyDog d=new BabyDog();
 d.printColor1();
 }
 }




