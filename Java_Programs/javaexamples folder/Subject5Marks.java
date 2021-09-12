//wap to accept 5 subject marks and calculate total , per and grade
import java.util.*;
class Subject5Marks
{
public static void main(String[] arg)
{
int m1,m2,m3,m4,m5;
int total;
float per;
char grade;
Scanner s=new Scanner(System.in);
System.out.println("enter marks1 ");
m1=s.nextInt();
System.out.println("enter marks2 ");
m2=s.nextInt();
System.out.println("enter marks3 ");
m3=s.nextInt();
System.out.println("enter marks4 ");
m4=s.nextInt();
System.out.println("enter marks5 ");
m5=s.nextInt();
total=m1+m2+m3+m4+m5;
per=(float) total/500.0f * 100.0f;

if (per >= 90) {
grade = 'A';
} else if (per >= 80) {
grade = 'B';
} else if (per >= 70) {
grade = 'C';

} else if (per >= 60) {
grade = 'D';
} else {
grade = 'F';
}
System.out.println("total = " + total);
System.out.println("percentage = " + per);
System.out.println("Grade = " + grade);

}

}