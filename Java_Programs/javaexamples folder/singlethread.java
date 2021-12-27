//single threads

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


 class singlethread
 {
 public static void main(String args[])
 {
 th1 ob1=new th1();
 ob1.start();

 Thread ov=Thread.currentThread();
 System.out.println(ob1);

 }
 }
