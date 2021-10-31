//another example 
import java.awt.*;
import java.awt.event.*;
class exam extends Frame
{
Checkbox r1,r2,r3,r4,r5,r6;
CheckboxGroup cbg1,cbg2,cbg3;
Label l1,l2,l3,l4;
Button b1;

exam()
{
l1=new Label("capital of india ?");
l1.setBounds(10,50,100,50);
add(l1);
cbg1=new CheckboxGroup();
r1=new Checkbox("mumbai",cbg1,true);
r1.setBounds(100,100,100,20);
add(r1);
r2=new Checkbox("delhi",cbg1,false);
r2.setBounds(200,100,100,20);
add(r1);
add(r2);

l2=new Label("capital of maharashtra ?");
l2.setBounds(10,150,100,50);
add(l2);
cbg2=new CheckboxGroup();
r3=new Checkbox("mumbai",cbg2,true);
r3.setBounds(100,200,100,20);
add(r3);
r4=new Checkbox("delhi",cbg2,false);
r4.setBounds(200,200,100,20);
add(r3);
add(r4);

b1=new Button("result");
b1.setBounds(100,350,100,20);
b1.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent ae) {
int total=0;

if(r2.getState() ==true)
{
total = total + 1;

}

if(r3.getState() ==true)
{
total = total + 1;

}
l2.setText("score out of 2 is " + total);

}
});
add(b1);
l2=new Label("info");
l2.setBounds(10,400,200,50);
add(l2);

setLayout(null);
setSize(400,600);
setVisible(true);
}
public static void main(String[] arg) {
exam e1=new exam();
}

}