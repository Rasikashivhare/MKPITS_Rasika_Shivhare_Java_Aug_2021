import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Details extends JFrame
{
JLabell1,l2,l3,l4,l5;
JTextField t1,t2,t3,t4,t5;
JButton b1,b2,b3,b4,b5;
static ArrayList <Customer> aList;
public Details()
{
aList=new ArrayList <Customer>();
l1=new JLabel("Name");
l1.setBounds(20,20,50,25);
add(l1);
t1=new JTextField();
t1.setBounds(100,20,150,25);
add(t1);
l2=new JLabel("Account_No");
l1.setBounds(20,70,70,25);
add(l2);
t2=new JTextField();
t2.setBounds(150,70,150,25);
add(t2);
l3=new JLabel("email_ID");
l3.setBounds(20,120,50,25);
add(l3);
t3=new JTextField();
t3.setBounds(100,120,150,25);
add(t3);
l4=new JLabel("Contact");
l4.setBounds(20,70,70,25);
add(l4);
t4=new JTextField();
t4.setBounds(100,170,150,25);
add(t4);

setTitle("Account Details");
setLayout(null);
setSize(320,420);
setVisible(true);

b1=new JButton("Enter");
b1.setBounds(120,220,100,25);
add(b1);
b1.addActionListener(new ActionListener()
{
@override
public void actionPerformed(ActionEvent e)
{
Customer c=new Customer();
c.setName(String.valueOf(t1.getText()));
c.setAccount_No(Integer.parseInt(t2.getText()));
c.setemail_ID(t3.getText());
c.setContact(Integer.parseInt(t4.getText()));
if(e.getSource()==b1)
{
aList.add(c);
for(Customer i:aList){
System.out.println(i);
}
}
}
});
}
public static void main(String arg[])
{
new Details();
}
}








