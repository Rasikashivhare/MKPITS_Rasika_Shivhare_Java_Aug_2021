//current class constructor

class Book {

String title;
int price;
//creating constructor with no arguments
Book ( )

{
System.out.println("constructor with no arguments called");
title="core java";
price=330;
this.display();
}
//creating constructor with 2 parameters
Book (String title,int price )
{
this();
System.out.println("constructor with 2 parameters invoked");
this.title=title;
this.price=price;
}
void display()
{
System.out.println("title = " + title); 
System.out.println("price = " + price); 
}

}
class thisex4 {
public static void main(String args[])
{
Book b=new Book("oracle",400);
b.display();

}
}