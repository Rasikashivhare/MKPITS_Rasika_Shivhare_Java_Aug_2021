//example of java super keyword

 class Animal
 {
 String color="white";
 }
 class Dog extends Animal
 {
 String color="black";
 void printColor()
 {
 System.out.println(color);//print color of dog class
  System.out.println(super.color);//prints color of animal class
  }
  }

  class TestSuper1
  {
  public static void main(String args[])
  {
  Dog d=new Dog();
  d.printColor();
  }
  }


