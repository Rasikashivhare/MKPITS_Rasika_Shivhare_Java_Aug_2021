//java tree map example -navigable map

import java.util.*;
class TreeMap3
{
public static void main(String args[])
{
NavigableMap<Integer,String>map=new TreeMap<Integer,String>();
map.put(100,"rasi");
map.put(102,"shubu");
map.put(101,"rasika");
map.put(103,"shz");
System.out.println("descendingMap:"+map.descendingMap());

System.out.println("headMap:"+map.headMap(102,true));

System.out.println("tailMap:"+map.tailMap(102,true));
System.out.println("subMap:"+map.subMap(100,false,102,true));
}
}
descendingMap{103=shz,102=shubu,101=rasika,100=rasi}
headMap:{100=shz,101=rasika,102=shubu}
tailMap:{102=shubu,103=rasi}
subMap{101=rasika,102=shubu}

