//example of this keyword in class book
class Book 
{

String title;
int price;
Book(String title,int price )
{
this.title=title;
this.price=price;
}
void display() 
{
System.out.println("title = " + title); 
System.out.println("price = " + price); 
}

}

class thisex1 {
public static void main(String args[]){
Book b=new Book("java",430);
b.display();
}
}