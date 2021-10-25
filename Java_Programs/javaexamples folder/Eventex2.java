//another example with 2 buttons

import java.awt.*;
import java.awt.event.*;
public class Eventex2 extends Frame implements ActionListener {
TextField tf;
Button b1,b2;
Eventex2() {
tf=new TextField();
tf.setBounds(10,50,200,50);
b1=new Button("click me");
b1.setBounds(50,150,100,50);
b1.addActionListener(this);
b2=new Button("clear");
b2.setBounds(200,150,100,50);
b2.addActionListener(this);
add(tf);
add(b1);
add(b2);
setTitle("event example");
setLayout(null);
setSize(250,250);
setVisible(true);
}
public void actionPerformed(ActionEvent ae) {
if(ae.getSource() == b1) {
tf.setText("roshani");
}
if(ae.getSource() == b2) {
tf.setText("");
}
}
public static void main(String[] arg) {
Eventex2 e1=new Eventex2();
}
}