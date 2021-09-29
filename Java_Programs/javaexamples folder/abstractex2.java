//example of abstract
 abstract class account
 {
 abstract void deposit();//method  without body
 void withdrawl()
 {
 //method with body
 System.out.println("withdrawl method");

 }
 }
 class saving extends account
 {
 void deposit()
 {
 System.out.println("deposit method of saving class");
 }
 }
 
 class abstractex2
 {
 public static void main(String []args)
 {
 //account act=new account();
 account act=null;
 act=new saving();
 act.deposit();
 
 }
 }
 