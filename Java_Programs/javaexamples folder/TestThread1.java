import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



class Thread10 extends Thread{
public void serviceRequest()
{
try{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
}

public void run(){
System.out.println(getName()+"Threads start working");
serviceRequest();
System.out.println(getName()+"Threads work done");
}
}
public class TestThread1
{
public static void main(String[] args){
Thread10 obj1=new Thread10();
Thread10 obj2=new Thread10();
Thread10 obj3=new Thread10();
obj1.start();
//obj2.setDaemon(true);
obj2.start();
obj3.start();
ExecutorService ex=Executors.newFixedThreadPool(3);
ex.execute(obj1);
ex.execute(obj2);
ex.execute(obj3);

ex.shutdown();
while(! ex.isTerminated()){
}
//for(;! ex.isTerminated();){}
System.out.println("All Threads work finished");
}
}





