import java.awt.*;
import java.awt.event.*;
class adapterex3 extends Frame
{
Label l1;
TextField t1;

adapterex3()
{
l1=new Label("mkpits");
l1.setBounds(10,50,250,20);
add(l1);
t1=new TextField();

t1.setBounds(10,120,250,20);

t1.addKeyListener(new

keyadapterclass(this));

add(t1);
setSize(400,400);
setLayout(null);
setVisible(true);
}
public static void main(String[] arg) {
adapterex3 a=new adapterex3();
}

}
class keyadapterclass extends KeyAdapter
{
adapterex3 ad;
keyadapterclass(adapterex2 ad)
{
this.ad=ad;
}

public void keyTyped(KeyEvent ke) {
System.out.println("key typed " );
}
}