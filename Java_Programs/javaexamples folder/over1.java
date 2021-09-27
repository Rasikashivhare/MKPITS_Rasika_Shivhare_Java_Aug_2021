//example of method overloading

//create two methods ,first add()method performs addition of two numbers and second add method performs addition of three numbers
class calculate
{
void add(int n1,int n2){

int res=n1+n2;
System.out.println("addition of 2 numbers is "+ res);
}
void add(int n1,int n2,int n3)
{
int res=n1+n2+n3;
System.out.println("addition of three no " + res);
}
}
class over1
{
public static void main(String []args)
{
calculate c1=new calculate();
c1.add(2,3);
c1.add(2,3,5);
}
}

