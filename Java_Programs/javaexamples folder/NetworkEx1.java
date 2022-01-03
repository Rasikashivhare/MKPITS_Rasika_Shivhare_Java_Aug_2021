import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkEx1{
public static void main(String []args)throws UnknownHostException
{
InetAddress ob=InetAddress.getLocalHost();
System.out.println(ob);
}
}
