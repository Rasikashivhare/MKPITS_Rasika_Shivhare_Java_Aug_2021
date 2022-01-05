import java.io.*;
import java.net.*;

class Client5
{
public static void main(String asd[]) throws Exception
{
Socket s=new Socket("localhost",2000);
System.out.println("client is sending request");


for(;;)
{
DataInputStream dis=new DataInputStream(System.in);
String str = dis.readLine();
PrintStream ps=new PrintStream(s.getOutputStream());
ps.println(str);

DataInputStream disl=new DataInputStream(s.getInputStream());
String str1 =dis1.readLine();

System.out.println("server "+str1);
if(str.equals("bye"))
{
System.exit(0);
//dis.close();
//dis1.close();
//ps.close();
//s.close();
}
}
}
}


