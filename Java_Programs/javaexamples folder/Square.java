//example of instance variable
import java.util.*;//java is package, util is subpackage
class Square
{
int num; // instance variable
public static void main(String []abc )
{
//creating instance (object ) of squarenumber class
Square s1=new Square();
s1.num=5;
System.out.println(" number stored in s1 instance var = " + s1.num);
Square s2=new Square();
s2.num=7;
System.out.println(" number stored in s2 instance var = " + s2.num);
}
}