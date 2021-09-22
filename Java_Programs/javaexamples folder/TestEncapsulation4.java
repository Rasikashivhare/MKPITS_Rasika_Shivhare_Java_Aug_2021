//create a class Product having field productid,productname,productprice and
//setter and getter method.



class Product
{
private int id;
private String name;
private float price;

//public getter and setter method
public int getId()
{
return id;
}
public void setId(int id)
{
this.id=id;
}
public String getName()
{
return name;
}
public void setName(String name)
{
this.name=name;
}
public float getPrice()
{
return price;
}
public void setPrice(float price)
{
this.price=price;
}


public class TestEncapsulation4
{
public static void main(String args[])
{
Product pro=new Product();
pro.setId(78);
pro.setName("rasi pashine");
pro.setPrice("30");
System.out.println(pro.getId()+""+pro.getName()+""+pro.getPrice());
}
}