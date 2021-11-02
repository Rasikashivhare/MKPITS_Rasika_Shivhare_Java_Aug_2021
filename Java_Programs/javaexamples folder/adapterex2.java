import java.awt.*;
import java.awt.event.*;
class adapterex2 extends Frame
{
Label l1;
TextField t1;
adapterex2()
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

adapterex2 a=new adapterex2();
}

}
class keyadapterclass extends KeyAdapter
{
adapterex2 ad;
keyadapterclass(adapterex2 ad)
{
this.ad=ad;
}
public void keyTyped(KeyEvent ke) {
System.out.println("key typed " );
char c = ke.getKeyChar();
System.out.println("char typed " + c);
ad.l1.setText(ad.t1.getText());
}
}