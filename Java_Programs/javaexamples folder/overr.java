//example  of overriding
class figure
{
void draw(){System.out.println("draw method of figure class");}
}
class triangle extends figure{
void draw(){System.out.println("draw method of triangle class");}
}
class overr{
public static void main(String []args)
{
figure f1=new figure();
f1.draw();
triangle t=new triangle();
t.draw();
}
}