//create a class product and create 2 objects
class Product
{
int productId;
String productName;
double productPrice;
}
class TestProduct
{
public static void main(String[] args)
{
Product p1=new Product();
p1.productId=123;
p1.productName="mike";
p1.productPrice=150;
//printing values of the object
System.out.println("product id="+p1.productId);//accessing member through reference variable
System.out.println("product name="+p1.productName);
System.out.println("product price="+p1.productPrice);
//creating an object or instance
Product p2=new Product();
p2.productId=144;
p2.productName="headphone";
p2.productPrice=450;
//printing values of object
System.out.println("product id="+p2.productId);
System.out.println("product name="+p2.productName);
System.out.println("product price="+p2.productPrice);
}
}

