//create a class customerid,custname,mobileno
class Customer
{
int custid;
String custName;
float mobileno;
String address;
}
class TestCustomer1
{
public static void main(String arg[])
{
Customer c1=new Customer();
c1.custid=110;
c1.custName="rita";
c1.mobileno=90089799;
c1.address="umred road";
//print values of an object
System.out.println("custid="+c1.custid);
System.out.println("custname="+c1.custName);
System.out.println("mobileno="+c1.mobileno);
System.out.println("address="+c1.address);

}
}
