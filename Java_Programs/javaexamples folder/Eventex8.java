// wap to accept 2 no. and print addition of 2
import java.awt.*;
import java.awt.event.*;

class Eventex8 extends Frame implements
ActionListener
{
Label l1,l2,l3;
TextField t1,t2;
Button b1;
Eventex8()
{
l1=new Label("enter number1");
l1.setBounds(20,50,100,25);
add(l1);
t1=new TextField();

t1.setBounds(130,50,100,25);

add(t1);

l3=new Label("enter number2");

l3.setBounds(20,100,100,25);

add(l3);
t2=new TextField();

t2.setBounds(130,100,100,25);

add(t2);

b1=new Button("add");

b1.setBounds(100,150,100,25);

b1.addActionListener(this);

add(b1);

l2=new Label("addition : ");

l2.setBounds(20,200,100,25);

add(l2);

setLayout(null);
setSize(300,300);
setVisible(true);

}


public void actionPerformed(ActionEvent ae)
{
int num1=Integer.parseInt(t1.getText());
int num2=Integer.parseInt(t2.getText());
//System.out.println("num " + num1);
int res=num1 + num2;
l2.setText("addition : " + res);

}

public static void main(String[] arg)
{
Eventex8 f=new Eventex8();

}

}