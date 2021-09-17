//example of book
class Book 
{

String title;
int price;
void insert(String title,int price )
{
this.title=title;
this.price=price;
//display(); // calling display method from insert method
this.display();
}
void display() {
System.out.println("title = " + title); //
System.out.println("price = " + price); //
}

}

class thisex3
{
public static void main(String args[]){
Book b=new Book();

b.insert("oracle",500);

}
}