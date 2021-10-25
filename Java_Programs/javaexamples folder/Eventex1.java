//example of event handling
import java.awt.*;
import java.awt.event.*;
class Eventex1 extends Frame implements ActionListener
{
Eventex1()
{
Button b1=new Button("ok");
b1.setBounds(100,50,100,25);
b1.addActionListener(this);
add(b1);
setLayout(null);
setSize(300,300);
setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
System.out.println("hello from button");
}
public static void main(String[] arg)
{
Eventex1 f=new Eventex1();
}
}
