//program by creating 2 structure variables stud1 and stud2
//create a structure student with members rno,name and address,pass this structure to function
//display to display structure values
struct student
 {
	int rno;
	char name[20];
	char address[20];
	
};
//creating function declaration
void display(struct student s1)
#include<stdio.h>
void main()
{
	struct student stud1,stud2;
printf("enter rno");
	scanf("%d",&stud1.rno);
	printf("enter name");
	scanf("%s",&stud1.name);
	printf("enter address");
	fflush(stdin);
	gets(stud1.address);
	printf("\n student1 details are");
	display(stud1);//passing structure to function
	//accepting values of second student
	printf("enter rno");
	scanf("%d",&stud2.rno);
	printf("enter name");
	scanf("%s",&stud2.name);
	printf("enter address");
	fflush(stdin);
	gets(stud2.address);
	printf("\n student 2 details are");
	display(stud2);
}
//creating function display
void display(struct student s1)
{
	printf("\n rno=%d",s1.rno);
	printf("\n name=%s",s1.name);
	printf("\n address=%s",s1.address);
}

