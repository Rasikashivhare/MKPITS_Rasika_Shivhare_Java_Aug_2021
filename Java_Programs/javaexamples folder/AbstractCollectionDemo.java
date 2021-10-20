//abstract collection class 
import java.util.*;
import java.util.AbstractCollection;
public class AbstractCollectionDemo
{
public static void main(String []args)
{
AbstractCollection<String>
abs1=new TreeSet<String>();
abs1.add("welcome");
abs1.add("To");
abs1.add("mkpits");
abs1.add("software");
abs1.add("solutions");
System.out.println("AbstractCollection1:"+abs1);
AbstractCollection<String>
abs2=new TreeSet<String>();
System.out.println("AbstractCollection2:"+abs2);
abs2.addAll(abs1);
System.out.println("AbstractCollection2:"+abs2);
abs1.clear();
System.out.println("Is the collection empty?"+abs1.isEmpty());
}
}


