//example of runtime polymorphism using account,saving and current class
import java.util.*;
class account
{
int actno;
int bal=1000;
String deposit(int actno,int amt)
{
return"account class deposit method";
}
String withdraw(int actno,int amt)
{
this.actno=actno;
if(amt>bal)
{
return "insufficient fund";
}
{
bal=bal-amt;
return "account withdrawl for acct no"+actno+",bal is"+bal;
}
}
}
class saving extends account
{
int interest=500;
String deposit(int actno,int amt)
{
this.actno=actno;
bal=bal+amt+interest;
return"account deposited for acctno "+actno+",bal is "+bal;
}
}
class current extends account
{

String deposit(int actno,int amt)
{
this.actno=actno;
bal=bal+amt;
return"account deposited for acctno "+actno+",bal is "+bal;
}
}
public class accountex2
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter account no");
int actno=s.nextInt();
System.out.println("enter amount ");
int amt=s.nextInt();
System.out.println("enter saving or current accttype ");
String acttype=s.next();
System.out.println("do you want to deposit or withdraw");
String ans=s.next();
account act=null;
String str;
if(acttype.equals("saving"))
{
act=new saving();
}
else if(acttype.equals("current"))
{
act=new current();
}
else
{
System.out.println("invalid account type");
}
if(ans.equals("deposit"))
{
str=act.deposit(actno,amt);
System.out.println(str);
}
else if(ans.equals("withdrawl"))
{
str=act.withdrawl(actno,amt);
System.out.println(str);
}
}
}










