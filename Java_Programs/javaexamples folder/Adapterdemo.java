//adapter class 

import java.awt.*;
import java.awt.event.*;
import java.awt.*;
 public class Adapterdemo extends Frame
 {
 public Adapterdemo()
 {
 addMouseListener(new MyMouseAdapter(this));
  addMouseMotionListener(new MyMouseMotionAdapter(this));
  setSize(300,300);
  setLayout(null);
  setVisible(true);
  }
  public static void main(String[] arg)
  {
  Adapterdemo ad=new Adapterdemo();
  }
  }
  class MyMouseAdapter extends MouseAdapter
  {
  Adapterdemo adapterdemo;
  public MyMouseAdapter(Adapterdemo adapterdemo)
  {
  this.adapterdemo=adapterdemo;
  }
  public void mouseClicked(MouseEvent me)
  {
  System.out.println("mouse clicked"+ me.getX()+","+me.getY());
  }
  }
  class MyMouseMotionAdapter extends MouseMotionAdapter
  {
  Adapterdemo adapterdemo;
  public MyMouseMotionAdapter(Adapterdemo adapterdemo)
  {
  this.adapterdemo=adapterdemo;
  }
  public void mouseDragged(MouseEvent me)
  {
  System.out.println("mouse dragged");
  }
  }
  

 