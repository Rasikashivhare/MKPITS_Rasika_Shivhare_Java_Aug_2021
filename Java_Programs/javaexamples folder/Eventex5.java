//wap to accept a no. and print table of that number.
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class Eventex5 extends Frame implements
ActionListener
{
Label l1;
TextArea l2;
TextField t1,t2,t3;
Button b1;
Eventex5()
{
l1=new Label("sub1");
l1.setBounds(20,50,100,25);
add(l1);
t1=new TextField();

t1.setBounds(130,50,100,25);

add(t1);

b1=new Button("result");

b1.setBounds(100,200,100,25);


b1.addActionListener(this);

add(b1);

l2=new TextArea(30,30);

l2.setBounds(20,250,100,105);

add(l2);

setLayout(null);
setSize(400,400);
setVisible(true);

}

public void actionPerformed(ActionEvent ae)
{
int s1=Integer.parseInt(t1.getText());
int res=1;
StringBuilder sb=new StringBuilder();
if(ae.getSource() == b1)

{
for(int i=1;i<=10;i++) {
res=s1 * i;
sb.append(s1 + " * " + i + "=" + res +"\n");

}
l2.setText(sb.toString());

}
}

public static void main(String[] arg)
{
Eventex5 f=new Eventex5();

}

}