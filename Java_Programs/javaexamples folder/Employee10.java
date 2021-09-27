//Write a program by creating an 'Employee' class having the following methods and print the final salary.
//1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
//2 - 'AddSal()' which adds 10 to salary of the employee if it is less than 500.
//3 - 'AddWork()' which adds 5 to salary of employee if the number of hours of work per day is more than 6hours.

import java.util.Scanner;
class Employee10

{

getInfo()

{

Scanner in = new Scanner(System.in);

System.out.println("Enter your salary");

double salary = in.nextDouble();

System.out.println("Enter the no.of working hours");

int hours = in.nextInt();

}

AddSal()

{

double sal;

if(sal < 500)

sal = sal + 10;

System.out.println("Salary: " + sal);

}

AddWork()

{

double sal; //local variable this will be limited to this AddWork function

int hours;

if(hours > 6)

sal =sal + 5;

System.out.println("Salary: " + sal);

}

public static void main()

{

Scanner in = new Scanner(System.in);

Employee10 obj = new Employee10();

obj.getInfo();

obj.AddSal();

obj.AddWork();

}

}

}

