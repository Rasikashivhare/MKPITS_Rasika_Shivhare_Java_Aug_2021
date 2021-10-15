import java.util.StringTokenizer;
public class Token2
{

public static void main(String args[]){
StringTokenizer st = new StringTokenizer("my name is khan"," ");
while (st.hasMoreTokens()) {
System.out.println(st.nextToken());
}
}
}