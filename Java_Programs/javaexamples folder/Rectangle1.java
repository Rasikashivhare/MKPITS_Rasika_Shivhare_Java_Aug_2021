//wap to print the area of two rectangles having sides(4,5) and (5,8) by creating a class named Rectangle with a method 'Area' 
//which returns the area and length and breadth passsed as parameters to its constructor
class Rectangle
{
int length;
int breadth;
public Rectangle(int l,int b)
{
length=l;
breadth=b;
}
public int getArea()
{
return length*breadth;
}
public int getPerimeter()
{
return 2*(length+breadth);
}
}
 class Rectangle1
 {
 public static void main(String []args)
 {
 Rectangle a=new Rectangle(4,5);
 Rectangle b=new Rectangle(5,8);
 System.out.println("Area: "+a.getArea()+"Perimeter is "+a.getPerimeter());
  System.out.println("Area: "+b.getArea()+"Perimeter is "+b.getPerimeter());
  }
  }
  

 