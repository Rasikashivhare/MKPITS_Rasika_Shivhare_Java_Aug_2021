//Java HashSet from another Collection

import java.util.*;
class HashSet4
{
public static void main(String args[]){
ArrayList<String> list=new ArrayList<String>();
list.add("Rasi");
list.add("shubhu");
list.add("shaz");

HashSet<String> set=new HashSet(list);
set.add("Gaurav");
Iterator<String> i=set.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
}
}