//wap to calculare grade if A score 90% and above A for a scor, B score of 80% or above,so on
class Grade
{
public static void main(String[] args) {

int testscore = 76;
char grade;

if (testscore >= 90) {
grade = 'A';
} else if (testscore >= 80) {
grade = 'B';
} else if (testscore >= 70) {
grade = 'C';
} else if (testscore >= 60) {
grade = 'D';
} else {
grade = 'F';
}
System.out.println("Grade = " + grade);
}

}