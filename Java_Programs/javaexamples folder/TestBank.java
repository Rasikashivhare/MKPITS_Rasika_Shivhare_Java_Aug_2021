//example of polymorphism

class Bank
{
int getRateOfInterest(){return 0;}
}
class SBI extends Bank
{
int getRateOfInterest(){return 8;}
}
class ICICI extends Bank
{
int getRateOfInterest(){return 7;}
}
class AXIS extends Bank
{
int getRateOfInterest(){return 9;}
}
class TestBank
{
public static void main(String []args)
{
Bank b=null;
java.util.Scanner s=new java.util.Scanner(System.in);
System.out.println("enter bank name");
String bn=s.next();
if(bn.equals("SBI"))
b=new SBI();
else if(bn.equals("ICICI"))
b=new ICICI();
if(bn.equals("AXIS"))
b=new AXIS();
System.out.println("SBI Rate Of interest:"+b.getRateOfInterest());
}
}





