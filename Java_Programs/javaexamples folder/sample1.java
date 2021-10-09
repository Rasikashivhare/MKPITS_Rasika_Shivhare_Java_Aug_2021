//example 2
class sample1
{
public static void main(String[] arg) {
int arr[] =new int[5];
int res=0;
try {
String s="abc";

int i=Integer.parseInt(s);

}catch (Exception ee) {
System.out.println(ee.toString());

}
finally {
System.out.println("finally executed");
}
System.out.println("bye");

System.out.println("program reached successfully till end");
}

}