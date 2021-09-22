//create a class Customer having field customerid, customername , customeremail,customermobile

class Customer
{
private int id;
private long mob_no;
private String name,email;

//public getter and setter method
public int getId()
{
return id;
}
public void setId(int id)
{
this.id=id;
}

public long getMob_no()
{
return mob_no;
}
public void setMob_no(long mob_no)
{
this.mob_no=mob_no;
}
public String getName()
{
return name;
}
public void setName(String name)
{
this.name=name;
}
public String getEmail()
{
return email;
}
public void setEmail(String email)
{
this.email=email;
}
}


public class TestEncapsulation3
{
public static void main(String args[])
{
Customer cus=new Customer();
cus.setMob_no(789999999L);
cus.setName("rasi pashine");
cus.setEmail("rasi@gmail.com");
System.out.println(cus.getMob_no()+""+cus.getName()+""+cus.getEmail());
}
}