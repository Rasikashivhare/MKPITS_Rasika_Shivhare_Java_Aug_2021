//example of employee has an object of address,address conatins its own information such as city ,state,country

public class Address
{
String city,state,country;

public Address(String city,String state,String country)
{
this.city=city;
this.state=state;
this.country=country;
}
}

public class Emp
{
int id;
String name;
Address address;

public Emp(int id,String name,Address address)
{
this.id=id;
this.name=name;
this.address=address;
}
 void display()
 {
 System.out.println(id+""+name);
 System.out.println(address.city+""+address.state+""+address.country);
 }
 public static void main(String args[])
 {
 Address address1=new Address("gzb","UP","india");
 Address address2=new Address("gno","UP","india");

  Emp e=new Emp(111,"rasi",address1);
  Emp e2=new Emp(123,"rasi",address2);
  e.display();
  e2.display();
  }
  }


