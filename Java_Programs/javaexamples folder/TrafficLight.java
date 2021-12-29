  import java.awt.*;
  import java.awt.event.*;

   import javax.swing.*;
   public class TrafficLight extends JFrame implements Runnable

 {
  JButton red, green, yellow ;
  TrafficLight()
   {
    setTitle("TrafficLight") ;
    setSize(500,500) ;
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    red = new JButton() ;
    yellow = new JButton() ;
    green = new JButton() ;
    setLayout(new GridLayout(3,1));
    this.add(red); this.add(yellow); this.add(green) ;

    Thread redThread = new Thread(this,"Red") ;

    Thread yellowThread = new Thread(this,"Yellow") ;

    Thread greenThread = new Thread(this,"Green") ;

    redThread.start() ;
    yellowThread.start() ;
    greenThread.start() ;

   }
   public synchronized void run()

   {

     

   }

   public static void main(String[] args)
   {
    new TrafficLight().setVisible(true);
   }

 }
