import javax.swing.*;
import java.awt.*;
public class TrafficSignal extends JFrame
{

JButton red,yellow,green;
TrafficSignal()
{
red=new JButton();
yellow=new JButton();
green=new JButton();
this.add(red);
this.add(yellow);
this.add(green);

setTitle("TrafficSignal");
setSize(400,400);
setLayout(null);

}





public static void main(String arg[])
{
new TrafficSignal().setVisible(true);
}
}






















