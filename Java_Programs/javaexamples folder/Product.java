//wap to accept customer ,productname,productprice and quantity and then print customername,productname,price,quantity and totaamount
import java.util.*;
class Product
{
public static void main(String arg[])
{
String customer,product;
int price,quantity,total_amount;
Scanner s=new Scanner(System.in);
System.out.println("enter customer name");
customer=s.nextInt();
System.out.println("enter product name");
product=s.nextInt();
System.out.println("enter product price");
price=s.nextInt();
System.out.println("enter quantity");
quantity=s.nextInt();
total_amount=price*quantity;
System.out.println("Cutomer name:"+ customer);
System.out.println("Product name:"+product);
System.out.println("Product price:"+price);
System.out.println("Quantity:"+quantity);

System.out.println("Total Amount:"+total_amount);
}
}
