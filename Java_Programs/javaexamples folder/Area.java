
//wap to print the area of rectangle by creating a class named 'Area'having two methods.First method named as 'setDim'take length and breadth of rectangle as parameters and
//the second method as 'getArea'returns the area of the rectangle.length and breadth are entered through keyboard

public class Area
{
int length,breadth;
Area(int l,int b)
{
length=l;breadth=b;
}
public int setDim()
{
int result=length*breadth;
return result  ;
}
public void getArea()
{
System.out.println("Area="+setDim());
}
public static void main(String args[])
{
Area a=new Area(6,7);
a.getArea();
}
}
