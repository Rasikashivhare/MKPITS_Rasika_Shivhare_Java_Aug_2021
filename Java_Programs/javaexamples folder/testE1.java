//example of encapsulation

 class Book
 {
 private int  id;
 private String title;
 private String author;

 //create setter and getter method

 public void setId(int id)
 {
 if(id>100)
 {
 this.id=id;
 }
 else
 {
 System.out.println("id should be greater than 100");
 }
}

 public int getId()
 {
 return id;
 }
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
 class testE1
 {
 public static void main(String arg[])
 {
 Book t=new Book();
 t.setId(112);
 System.out.println("id = " + t.getId());
 t.setTitle("java");
  System.out.println("title of the book is " + t.getTitle());
  t.setAuthor("mary");
   System.out.println("author of the book is " + t.getAuthor());
   }
   }


