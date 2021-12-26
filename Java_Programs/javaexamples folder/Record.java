public class Record extends JFrame
{
JMenuBar menubar;
JMenu ins,upd,del,view,va,da;
public Record()
{
menubar=new JMenuBar();
ins=new JMenu("Insert");
upd=new JMenu("update");
del=new JMenu("Delete");
view=new JMenu("view");
va=new JMenu("View All");
da=new JMenu("Delete All");

menubar.add(ins);
menubar.add(upd);
menubar.add(del);
menubar.add(view);
menubar.add(va);
menubar.add(da);

setTitle("Account Details");
setLayout(null);
setSize(320,420);
setVisible(true);
setJMenubar(menubar);
}
public static void main(String[] args)
{
new Record();
}
}


