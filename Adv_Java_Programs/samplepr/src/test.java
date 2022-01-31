import java.awt.*;
public class test extends Frame{
    Button b;
    test();
    {
        b=new Button (label: 'hello');
        b.setBounds(x: 100,y: 100,width:100,height:20);
        add(b);
        setLayout(null);
        setVisible(true);
        setSize(width:400,height: 400);
    }
    public static void main(String[] arg)
    {
        test t=new test();
    }
}
