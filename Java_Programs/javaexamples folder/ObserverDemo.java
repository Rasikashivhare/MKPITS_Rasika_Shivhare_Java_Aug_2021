// Java code to demonstrate addObserver() method
import java.util.*;

class Observer1 implements Observer
{

public void update(Observable obj, Object arg)
{
System.out.println("Observer1 is added");
}
}

class BeingObserved extends Observable
{
void incre()
{
setChanged();
notifyObservers();
}
}

class ObserverDemo 
{
public static void main(String args[])
{
BeingObserved beingObserved = new BeingObserved();
Observer1 observer1 = new Observer1();
beingObserved.addObserver(observer1);
beingObserved.incre();
}
}