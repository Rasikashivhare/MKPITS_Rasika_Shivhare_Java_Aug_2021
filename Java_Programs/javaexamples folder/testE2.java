//create  a read only class Book having getter methods

class Book
{
private int id=111;
private String title="java";
public int getId()
{
return id;
}
public String getTitle()
{
return title;
}
}
class testE2
{
public static void main(String args[])
{
Book t=new Book();
//t.setId(-11);
System.out.println("id=" + t.getId());
//t.setTitle("java");
System.out.println("title=" + t.getTitle());
}
}
