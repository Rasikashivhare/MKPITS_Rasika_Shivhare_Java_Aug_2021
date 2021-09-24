//another example of hierarchical inheritance
//create a parent class Account having fields acctno,balance
//create a class saving inherited from account class having deposit method
//create a class current inherited from account class having deposit method without interest

class account
{
int acctno;
int balance;
void insertaccountdata(int acctno,int balance)
{
this.acctno=acctno;
this.balance=balance;
}
void showbalance()
{
System.out.println("balance for acctno "+ acctno + "is" +balance);
}
}
class saving extends account
{
void deposit(int amount)
{
int interest=500;
balance=balance+amount+interest;
System.out.println("amount deposited successfully in saving account");
}
}
class current extends account
{
void deposit(int amount)
{
balance=balance+amount;
System.out.println("amount deposited successfullyin current account");
}
}
class testaccount
{
public static void main(String[] arg)
{
saving s=new saving();
s.insertaccountdata(123,1000);
s.deposit(200);
s.showbalance();

current c=new current();

c.insertaccountdata(223,10000);
c.deposit(1000);

c.showbalance();

}
}
