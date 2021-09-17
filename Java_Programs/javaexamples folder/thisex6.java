//Calling parameterized constructor from default constructor:

class Book {

String title;
int price;
String company;
//creating constructor with no arguments

Book ( )
{
this("java",200,"macmohan"); // calling paramerized constructor from default

constructor

}
//creating constructor with 2 parameters
Book (String title,int price,String company )
{

this.title=title;
this.price=price;
this.company="macmohan";

}
void display() {
System.out.println("title = " + title); //
System.out.println("price = " + price); //
System.out.println("company = " + company); //
}

}
class thisex6
{
public static void main(String args[]){
Book b=new Book();
b.display();

}