
//example to create abutton inside frame
import java.awt.*;
class Frameex3 extends Frame
{
Frameex3()
{
Button b1=new Button("ok");
b1.setBounds(150,100,100,50);
setTitle("mkpits solutions");
setLayout(null);
add(b1);
setSize(400,400);
setVisible(true);
}
public static void main(String[] arg)
{
Frameex3 f=new Frameex3();
}
}
