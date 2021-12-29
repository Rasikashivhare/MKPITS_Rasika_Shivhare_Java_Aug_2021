import javax.swing.*;
import java.awt.*;
public class TrafficSignals extends JFrame
{

JButton red,yellow,green;
TrafficSignals()
{
red=new JButton();
yellow=new JButton();
green=new JButton();
this.add(red);
this.add(yellow);
this.add(green);



}





public static void main(String arg[])
{
new TrafficSignals().setVisible(true);
}
}






















