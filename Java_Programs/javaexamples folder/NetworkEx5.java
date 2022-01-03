import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkEx5{
public static void main(String []args)throws UnknownHostException
{
InetAddress ob=InetAddress.getLocalHost();
System.out.println(ob);
System.out.println(ob.getHostAddress());
System.out.println(ob.getHostName());
System.out.println(ob.getAllByName("www.google.com"));

}
}
