//example of default access modifier
//save by A.java
package pack;
  class A
{
 void msg(){System.out.println("Hello");}
}
//save by B.java
package mypack;
import pack.*;
class b2 {
	public static void main(String args[])
	{
		A obj=new A();
		obj.msg();
	}
}
