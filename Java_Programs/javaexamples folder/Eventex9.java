

//example 
import java.awt.*;
import java.awt.event.*;

class Eventex9 extends Frame implements
ActionListener
{
Label l1,l2;
TextField t1;
Button b1;
Eventex9()
{
l1=new Label("enter number");
l1.setBounds(20,50,100,25);
add(l1);
t1=new TextField();

t1.setBounds(130,50,100,25);

add(t1);
l2=new Label("square : ");

l2.setBounds(20,150,100,25);

add(l2);

b1=new Button("ok");
b1.setBounds(100,100,100,25);
//register the button component with the listener
b1.addActionListener(this);
add(b1);
setLayout(null);
setSize(300,300);
setVisible(true);

}
//implementation of actionlistener interface method
actionperformed

public void actionPerformed(ActionEvent ae)
{
int num1=Integer.parseInt(t1.getText());
//System.out.println("num " + num1);
int sq=num1*num1;
l2.setText("square : " + sq);

}

public static void main(String[] arg)
{
Eventex9 f=new Eventex9();

}

}