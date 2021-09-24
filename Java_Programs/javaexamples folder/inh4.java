//create a class person and then create a child class customer having fiels custno,gstno

class person
{
String name;
String address;
void insertpersondata(String name,String address)
{
this.name=name;
this.address=address;
}
void displaypersondata()
{
System.out.println("name" +name);
System.out.println("address" + address);
}
}

//create inherited class
class customer extends person
{
int custno;
int gstno;
void insertcustomerdata(int custno,int gst)
{
this.custno=custno;
this.gstno=gstno;
}
void displaycustomerdata()
{
System.out.println("custno" + custno);
System.out.println("gstno" + gstno);
}
}

class inh4
{
public static void main(String []args)
{
customer e1=new customer();
e1.insertpersondata("rasishubu","nagpur");
e1.insertcustomerdata(12,1234567);
e1.displaypersondata();
e1.displaycustomerdata();
}
}

