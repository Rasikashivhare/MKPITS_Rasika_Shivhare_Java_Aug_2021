class Thread11 extends Thread{

public void run(){


for(int i=0;i<=5;i++)
{
System.out.println("hi"+getName()+ isDaemon());
}
}
}

public class TestThread3
{
public static void main(String[] args)
{
Thread11 obj1=new Thread11();
Thread11 obj2=new Thread11();
Thread11 obj3=new Thread11();
obj1.start();
obj2.setDaemon(true);
obj2.start();
obj3.start();
}
}

