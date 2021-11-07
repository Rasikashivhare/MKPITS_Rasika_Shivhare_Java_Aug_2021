//Simple example of Swing by inheritance

import javax.swing.*;
public class Simpl2 extends JFrame{//inheriting JFrame
JFrame f;
Simpl2(){
JButton b=new JButton("click");
b.setBounds(130,100,100, 40);

add(b);//adding button on frame
setSize(400,500);
setLayout(null);
setVisible(true);
}
public static void main(String[] args) {
new Simpl2();
}}