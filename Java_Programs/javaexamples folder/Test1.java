//create a class product and initilize it with method.

class ProductMethod
{
//defining fields
int productId;
String productName;
double productPrice;
//creating method to insert product
public void insertProduct(int pid,String pn,double pr)
{

productId=pid;
productName=pn;
productPrice=pr;

}

public void displayProduct()

{

System.out.println("product id = " +productId);

System.out.println("product name = " + productName);
System.out.println("product price = " + productPrice);

}

}
class Test
{

public static void main(String args[]){
//Creating an object or instance
Product p1=new Product();//creating an object of Product
p1.insertProduct(11,"monitor",12000);
p1.displayProduct();

}
}