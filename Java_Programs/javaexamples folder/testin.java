
//example of interface

interface Shape 
{
void draw();
}
class circle implements Shape {
public void draw( ) {
System.out.println("code to draw circle");
}
}
class rectangle implements Shape 
{
public void draw( ) 
{
System.out.println("code to draw rectangle");
}
}
class testin
{
public static void main(String[] arg) {
Shape s=new circle();
s.draw();
s=new rectangle();

s.draw();
}
}