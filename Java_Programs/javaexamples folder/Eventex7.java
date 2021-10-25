
//wap to accept 2 no. and create buttons for addtion ,substraction and multiplication

import java.awt.*;
import java.awt.event.*;

class Eventex7 extends Frame implements
ActionListener
{
Label l1,l2,l3;
TextField t1,t2;
Button b1,b2,b3;
Eventex7()
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

b1.setBounds(20,150,100,25);


b1.addActionListener(this);

add(b1);

b2=new Button("substract");

b2.setBounds(125,150,100,25);


b2.addActionListener(this);

add(b2);

b3=new Button("multiply");

b3.setBounds(230,150,100,25);

b3.addActionListener(this);

add(b3);

l2=new Label("addition : ");

l2.setBounds(20,200,100,25);

add(l2);

setLayout(null);
setSize(400,300);
setVisible(true);

}

public void actionPerformed(ActionEvent ae)
{
int num1=Integer.parseInt(t1.getText());
int num2=Integer.parseInt(t2.getText());
//System.out.println("num " + num1);
int res=0;
if(ae.getSource() == b1)
{
res=num1 + num2;
}
if(ae.getSource() == b2)

{
res=num1 - num2;

}
if(ae.getSource() == b3)

{
res=num1 * num2;

}
l2.setText("result : " + res);

}

public static void main(String[] arg)
{
Eventex7 f=new Eventex7();

}

}