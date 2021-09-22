// create a write only book 
 
 class Book
 {
 private int id;
 private String title;
 
 
 public void setId(int id)
 {
 this.id=id;
 }
 public void setTitle(String title)
 {
 this.title=title;
 }
 public void display()
 {
 System.out.println("id =" +id);
 System.out.println("title=" + title);
 }
 }
 class testE3
 {
 public static void main(String []arg)
 {
 Book t=new Book();
 t.setId(11);
 //System.out.println("id="+ t.getId());
 t.setTitle("java");
  //System.out.println("title="+ t.getTitle());
  t.display();
  }
  }
  

 //