//ex : create an interface shape having method declaration for draw method
interface shape1
{
void draw() ;
}
class circle implements shape1
{
public void draw() {
System.out.println( "code to draw circle");
}

}
public class interfaceex1
{
public static void main(String[] args) {
shape1 s=new circle();
s.draw();
}
}