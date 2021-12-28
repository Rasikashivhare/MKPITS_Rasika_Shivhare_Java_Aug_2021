class th3 extends Thread
{
 public void run()
 {
 for(int i=0;i<=10;i++)

 {
 System.out.println("A-"+getName());
 }
 }
 }
 public class ThreadEx4
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
  a1.sleep(1000);
}catch (Exception e){
System.out.println(e);
}

 }
 }


