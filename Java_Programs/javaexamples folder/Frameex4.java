
//example to create abutton inside frame

import java.awt.*;
class Frameex4
{
Frameex4()
{
	Frame fr=new Frame();

Button b1=new Button("ok");
b1.setBounds(50,50,200,100);
fr.setTitle("mkpits solutions");
fr.setLayout(null);
fr.add(b1);
fr.setSize(400,400);
fr.setVisible(true);
}
public static void main(String[] arg)
{
Frameex4 f=new Frameex4();
}
}
