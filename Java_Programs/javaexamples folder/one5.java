class thr1 implements Runnable
{
Thread t;
thr1()
{
t=new Thread(this);
t.start();
}

@Override
public void run()
{
System.out.println("hi"+t.getName());
}
}

class one5
{
public static void main(String args[]){
thr1 ob=new thr1();
thr1 ob1=new thr1();
}
}
