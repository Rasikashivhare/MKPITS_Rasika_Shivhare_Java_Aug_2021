//create a class product and create 2 objects
class Product
{
int productid;//fields
String productName;
double productPrice;
}
class TestProduct1
{
public static void main(String arg[])
{
//create an object
Product p1=new Product();
p1.productid=110;
p1.productName="maggie";
p1.productPrice=20;
//print values of an object
System.out.println("productid="+p1.productid);
System.out.println("productname="+p1.productName);
System.out.println("productprice="+p1.productPrice);
//create an object
Product p2=new Product();
p2.productid=100;
p2.productName="munch";
p2.productPrice=30;
//print values of an object
System.out.println("productid="+p2.productid);
System.out.println("productname="+p2.productName);
System.out.println("productprice="+p2.productPrice);
}
}



