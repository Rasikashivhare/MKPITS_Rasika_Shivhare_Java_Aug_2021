import javax.swing.*;
import java.awt.*;
public class window_1
{
Window wob;
Frame f;
JButton red,yellow,green;
window_1()
{
f=new Frame();
wob=new Window(f);
red=new JButton();
yellow=new JButton();
green=new JButton();
wob.add(red,BorderLayout.NORTH);
wob.add(yellow,BorderLayout.SOUTH);
wob.add(green,BorderLayout.EAST);

//wob.setTitle("TrafficSignal");
wob.setSize(400,400);
//wob.setLayout(null);
wob.setVisible(true);
}





public static void main(String arg[])
{
new window_1();
}
}






















