// Java code to demonstrate addObserver() method
import java.util.*;

class ObserverDemo1
{
// Driver method of the program
public static void main(String args[])
{
ArrayList<String> list=new ArrayList<String> ();
list.add("apple");
list.add("mango");
list.add("banana");
for (int i=0, n=list.size(); i < n; i++)
System.out.println( list.get(i));

for (Iterator i=list.iterator(); i.hasNext(); )
System.out.println( i.next());

}
}