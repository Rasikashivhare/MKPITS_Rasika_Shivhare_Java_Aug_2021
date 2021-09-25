//example of aggregation
//example of operation class in the circle class

class Operation
{
int square(int n)
{
return n*n;
}
}

class Circle1
{
Operation op;//aggregation
double pi=3.14;
 double area(int radius)
 {
 op=new Operation();
 int rsquare=op.square(radius);
 return pi*rsquare;
 }
 public static void main(String args[])
 {
 Circle1 c=new Circle1();
 double result=c.area(5);
 System.out.println(result);
 }
 }
