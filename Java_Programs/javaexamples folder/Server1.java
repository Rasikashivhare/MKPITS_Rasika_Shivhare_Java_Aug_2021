import java.io.IOException;
import java.net.ServerSocket;

public class Server1
{
public static void main(String[] args)
{
	try
{
ServerSocket ss=new ServerSocket(6666);
System.out.println("waiting for client to connect..");

Socket s=ss.aacept();
}
catch(Exception e){System.out.println(e);}
}
}