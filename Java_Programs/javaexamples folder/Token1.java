import java.util.StringTokenizer;
public class Token1.java

{
public static void main(String args[]){
StringTokenizer st = new StringTokenizer("my .name .is .rasika",".");
while (st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
}
}