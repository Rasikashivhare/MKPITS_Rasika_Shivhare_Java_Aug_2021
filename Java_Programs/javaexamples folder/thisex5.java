//calling constructor with one parameter using this keyword
class Book {

String title;
int price;
String company;
//creating constructor with no arguments
Book (String company )

{
this.company=company;

}
//creating constructor with 2 parameters
Book (String title,int price,String company )
{
this(company); 
System.out.println("constructor with 2 parameters invoked");
this.title=title;
this.price=price;
}
void display() {
System.out.println("title = " + title); //
System.out.println("price = " + price); //
System.out.println("company = " + company); //
}

}
class thisex5
{
public static void main(String args[]){
Book b=new Book("oracle",400,"mkpits");//it will call constructor with 2 parameters
b.display();

}
}