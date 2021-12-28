class th3 extends Thread
{
 public void run()
 {
 for(int i=0;i<=10;i++)

 {
 System.out.println("A-"+getName()+"  =:"+i);
 }
 }
 }
 public class ThreadEx5
 {
 public static void main(String[] args)
 {
 th3 a1=new th3();
 th3 a2=new th3();
 th3 a3=new th3();
 th3 a4=new th3();
 th3 a5=new th3();

/*a1.setPriority(10);
System.out.println(a1);
 a1.setName("rasi");
  a2.setName("ra");
  a3.setName("rasika");
  a4.setName("shiv");
  a5.setName("rasi");*/

  a1.start();
  a2.start();
    a3.start();
    a4.start();
  a5.start();
  try{
	  System.out.println("thread is suspended");
   a1.suspend();
   Thread.sleep(1000);
   System.out.println("thread is resuming");
   a1.resume();
  }catch (Exception e){
  System.out.println(e);
}


  a5.start();


 }
 }


