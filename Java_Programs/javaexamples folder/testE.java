//create a class book having private fields title and author and methods(setter and getter methods)setTitle,set author and getTitle() and getAuthor()

class Book
{
private String title;
private String author;
//create setter and getter method
public void setTitle(String title)
{
this.title=title;
}
public String getTitle()
{
return title;
}
public void setAuthor(String author)
{
this.author=author;
}
public String getAuthor()
{
return author;
}
}
class testE
{
public static void main(String[] arg)
{
Book t=new Book();
t.setTitle("java");
System.out.println("title of the book is " + t.getTitle());
t.setAuthor("martin");
System.out.println("author of the book is " + t.getAuthor());
}
}

