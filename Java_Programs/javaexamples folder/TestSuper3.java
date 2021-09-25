 //example of employee
 
 class employee
 
 {
 String empname="rasi";
 }
 class parttimeemployee extends employee
 {
 String empname="rasi";
 void display()
 {
 System.out.println("parttime emp name is "+ empname);
  System.out.println("parttime emp name is "+ super.empname);
  }
  }
  class TestSuper3
  {
  public static void main(String args[])
  {
  parttimeemployee p1=new parttimeemployee();
  p1.display();
  }
  }
