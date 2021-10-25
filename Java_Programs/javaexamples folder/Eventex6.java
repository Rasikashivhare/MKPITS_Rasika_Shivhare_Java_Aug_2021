
//wap to accept 3 subject marks and display total,percentage and grade;
import java.awt.*;
import java.awt.event.*;
class Eventex6 extends Frame implements

ActionListener
{
Label l1,l2,l3,l4,l5,l6;
TextField t1,t2,t3;
Button b1;
Eventex6()
{
l1=new Label("sub1");
l1.setBounds(20,50,100,25);
add(l1);
t1=new TextField();

t1.setBounds(130,50,100,25);

add(t1);

l3=new Label("sub2");

l3.setBounds(20,100,100,25);

add(l3);
t2=new TextField();

t2.setBounds(130,100,100,25);

add(t2);

l4=new Label("sub3");

l4.setBounds(20,150,100,25);

add(l4);
t3=new TextField();

t3.setBounds(130,150,100,25);

add(t3);

b1=new Button("result");

b1.setBounds(100,200,100,25);

b1.addActionListener(this);

add(b1);

l2=new Label("total : ");

l2.setBounds(20,250,100,25);

add(l2);

l5=new Label("percentage : ");

l5.setBounds(20,300,100,25);

add(l5);

l6=new Label("grade : ");

l6.setBounds(20,350,100,25);

add(l6);

setLayout(null);
setSize(400,400);
setVisible(true);

}


public void actionPerformed(ActionEvent ae)
{
int s1=Integer.parseInt(t1.getText());
int s2=Integer.parseInt(t2.getText());
int s3=Integer.parseInt(t3.getText());
//System.out.println("num " + num1);
int total=0;
float per=0;
String grade=null;
if(ae.getSource() == b1)
{
total=s1+s2+s3;
per=(float) (total/ 300.0f) * 100.0f;
if(per >= 75)

grade="distinction";
else if(per >= 60 && per < 75)
grade="first";
else
grade="fail";

}
l2.setText("total : " + total);
l5.setText("percentage : " + per);
l6.setText("grade : " + grade);

}

public static void main(String[] arg)
{
Eventex6 f=new Eventex6();

}

}