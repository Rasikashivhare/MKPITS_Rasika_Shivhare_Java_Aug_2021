class student
{
void getdata(String name)
{
System.out.println("name is "+ name);
}
void getdata(String name,String address)
{
getdata("rasi");
System.out.println("address " + address);
}
}
class over3
{
public static void main(String []args)
{
student s1=new student();
s1.getdata("rasi", "sadar");
}
}
