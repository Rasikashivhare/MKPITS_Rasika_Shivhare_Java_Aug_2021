//wap to accept your name and write this name in a file
import java.io.*;
import java.util.*;

class file1
{
public static void main(String[] arg)
{
try
{
FileOutputStream fs=new FileOutputStream("e://myfile1.txt");
Scanner scan=new Scanner(System.in);
System.out.println("enter your name");

String str="name ";
str += scan.nextLine();
byte[] arr=str.getBytes();

fs.write( arr);
fs.close();
System.out.println("data written to file successfully");
}
catch(Exception ee) {
System.out.println(ee.toString());
}

}

}
