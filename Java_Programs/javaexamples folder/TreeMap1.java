//java tree map example 

import java.util.*;
class TreeMap1
{
public static void main(String args[])
{
TreeMap<Integer,String>map=new TreeMap<Integer,String>();
map.put(100,"Rasi");
map.put(102,"shubu");
map.put(101,"rasika");
map.put(103,"shz");
for(Map.Entry m:map.entrySet())
{
System.out.println(m.getKey()+""+m.getValue());
}
}
}
