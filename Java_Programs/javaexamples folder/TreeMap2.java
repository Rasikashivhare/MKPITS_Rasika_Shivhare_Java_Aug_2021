//java tree map example 2

import java.util.*;
class TreeMap2
{
public static void main(String args[])
{
TreeMap<Integer,String>map=new TreeMap<Integer,String>();
map.put(100,"Rasi");
map.put(102,"shubu");
map.put(101,"rasika");
map.put(103,"shz");
System.out.println("Before invoking remove()method");
for(Map.Entry m:map.entrySet())
{
System.out.println(m.getKey()+""+m.getValue());
}
map.remove(102);
System.out.println("After invoking remove() method");
for(Map.Entry m:map.entrySet())
{
System.out.println(m.getKey()+""+m.getValue());

}
}
}
