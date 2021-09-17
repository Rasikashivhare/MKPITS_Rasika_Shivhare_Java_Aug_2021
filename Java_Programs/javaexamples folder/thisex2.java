//another example of this

class Book 
{

String title;
int price;
void insert(String title,int price )
{
this.title=title;
this.price=price;
}
void display() {
System.out.println("title = " + title); //
System.out.println("price = " + price); //
}

}

class thisex2 {
public static void main(String args[]){
Book b=new Book();
b.insert("oracle",500);
b.display();
}
}