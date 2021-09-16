//simple example of private access modifier
class A{
private int data=40;
private void msg(){Sysytem.out.println("Hello java");}
}
public class Simplee
{
public static void main(String args[]){
A obj=new A();
System.out.println(obj.data);
obj.msg();
}
}
