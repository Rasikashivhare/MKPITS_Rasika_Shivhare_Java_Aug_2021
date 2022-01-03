import java.io.IOException;
import java.net.Socket;

public class Client1
{
public static void main(String[] args)throws IOException
{
	try{
Socket s=new Socket("localhost",6666);
s.close();
}catch(Exception e)
{System.out.println(e);
}
}
}