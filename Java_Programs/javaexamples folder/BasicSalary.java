//wap to accept basic salary and then calculate bonus(bonus=1000 if salary>10000,bonus=500if salary>5000or bonus=100)
import java.util.Scanner;
class BasicSalary
{
public static void main(String[] args)
{

int basicsalary,bonus=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter basicsalary");
basicsalary=s.nextInt();
if (basicsalary>=10000) {
bonus=1000;
} else if(basicsalary >= 5000 &&basicsalary<10000)
{
bonus=500;
}
else
{
bonus=100;
}
System.out.println("bonus= " + bonus);
}

}