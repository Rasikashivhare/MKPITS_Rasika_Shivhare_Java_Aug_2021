 //serialization example
import java.io.*;
public class Persist1
{
public static void main(String[] arg) {
try
{
Customer s1=new Customer("amit","a@gmail.com");
FileOutputStream fos=new FileOutputStream("e://iofiles//cust.txt");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(s1); //serialization
oos.flush();
fos.close();
System.out.println("success");
}
catch(Exception ee)
{
System.out.println(ee.toString() );
}
}

}