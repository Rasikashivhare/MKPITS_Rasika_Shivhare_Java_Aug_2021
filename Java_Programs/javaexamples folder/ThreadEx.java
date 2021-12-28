class th3 extends Thread
{
 public void run()
 {
 for(int i=0;i<=10;i++)
 {
 if(getName().equals("Thread-5")){
 System.out.println("hi");
 }
 System.out.println("A-"+getName());
 }
 }
 }
 public class ThreadEx
 {
 public static void main(String[] args)
 {
 th3 a1=new th3();
  th3 a2=new th3();
 th3 a3=new th3();
 th3 a4=new th3();
 a1.start();
 a2.start();
 a3.start();
 a4.start();
 th3 a5=new th3();
 a5.start();
 th3 a6=new th3();
 a6.start();
 }
 }


