//Java AWT Toolkit Example: Change TitleBar Icon

import java.awt.*;
class ToolkitExample2 {
ToolkitExample2(){
Frame f=new Frame();
Image icon = Toolkit.getDefaultToolkit().getImage("D:\\icon.png");
f.setIconImage(icon);
f.setLayout(null);
f.setSize(400,400);
f.setVisible(true);
}
public static void main(String args[]){
new ToolkitExample2();
}
}