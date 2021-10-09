//example of DePersist 

import java.io.*;
class DePersist3
{
public static void main(String args[])throws Exception{
ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
Student s=(Student)in.readObject();
System.out.println(s.id+" "+s.name+" "+s.age);
in.close();
}
}