   class List extends Thread   
{  
   List(String threadname, ThreadGroup tgob)  
    { 
    super(tgob, threadname);  
    }  
    public void run()  
    {  
        for (int i = 0; i < 10; i++)   
        {  
            try  
            {  
                Thread.sleep(10);  
            }  
            catch (InterruptedException ex){  
            }  
        }  
        System.out.println(Thread.currentThread().getName() + " completed executing");  
    }  
}   
       public class ThreadGroupList  
{  
       public static void main(String arg[]) 
    {   
        ThreadGroup tg1 = new ThreadGroup("Parent thread");  
        ThreadGroup tg2 = new ThreadGroup(tg1, "Child thread");  
            
        List t1 = new List("Thread1", tg1);  
        System.out.println(t1.getName() +" starts");  
        t1.start();  
          
        List t2 = new List("Thread2", tg1);  
        System.out.println(t2.getName() +" starts");  
        t2.start();  
  
        System.out.println("\nListing parentThreadGroup: " + tg1.getName() + ":");   
        tg1.list();  
    }  
    }
    