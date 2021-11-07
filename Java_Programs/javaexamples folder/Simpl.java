
import javax.swing.*;
public class Simpl
{
JFrame f;
Simpl(){
f=new JFrame();

JButton b=new JButton("click");//creating instance of JButton
b.setBounds(130,100,100, 40);

f.add(b);

f.setSize(400,500);//400 width and 500 height
f.setLayout(null);//using no layout managers
f.setVisible(true);
}

public static void main(String[] args) {
new Simpl();
}
}