class th1 extends Thread
{
public void run()
{
for(int i=0;i<=10;i++)
{
System.out.println("thread"+getName());
}
}
}


class th2 extends Thread
{
 public void run()
 {
 for(int i=0;i<=10;i++)
 {
 System.out.println("thread"+getName()+""+isAlive());
 }
 }
 }
 
 class th3 extends Thread
 {
 public void run()
 {
 for(int i=0;i<=10;i++)
 {
 System.out.println("thread"+getName());
 }
 }
 }
 
 
 
 
 class multiplethread
 {
 public static void main(String args[])
 {
 th1 ob1=new th1();
 th2 ob2=new th2();
 th3 ob3=new th3();
 ob1.start();
 ob2.start();
 ob3.start();
 Thread ov=Thread.currentThread();
 System.out.println(ob1);
 System.out.println(ov);
 }
 }
 