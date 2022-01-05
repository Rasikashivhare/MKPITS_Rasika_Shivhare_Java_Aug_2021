import java.io.*;
import java.net.*;

class Server5
{
public static void main(String asd[]) throws Exception
{
ServerSocket ss=new ServerSocket (2000);
System.out.println("server is ready at port no 2000");

Socket s=ss.accept();
System.out.println("client is connected");

for(;;)
{
DataInputStream dis=new DataInputStream(s.getInputStream());
String str = dis.readLine();
System.out.println("client" + str);

PrintStream ps=new PrintStream(s.getOutputStream());
DataInputStream disl=new DataInputStream(System.in);
String str1=dis1.readLine();
ps.println(str1);
if(str1.equals("bye"))
{
System.exit(0);
//dis.close();
//dis1.close();
//ps.close();
//s.close();
//ss.close();
}
}
}
}


