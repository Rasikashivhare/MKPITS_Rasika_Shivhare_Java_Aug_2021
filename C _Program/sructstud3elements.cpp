//wap to create a structure array of 3 elements of structure student
//creating a structure student with members rno,name and address, pass this structure to function
//display to display structure values
struct student
{
	int rno;
	char name[20];
	char address[20];
	
};
//creating function declaration
void display(struct student s1);
#include<stdio.h>
int main()
{
	struct student stud[3];
	int i=0;
	while(i<3)
	{
		
	
	printf("enter rno");
	scanf("%d",&stud[i].rno);
	printf("enter name");
	scanf("%s",&stud[i].name);
	printf("enter address");
	fflush(stdin);
	gets(stud[i].address);
	printf("\n student[%d]details are",i+1);
	display(stud[i]);//passing structure to function
	i++;
}
}
//creating function display with structure parameter
void display(struct student s1)
{
	printf("\n rno=%d",s1.rno);
	printf("\n name=%s",s1.name);
	printf("\n name=%s",s1.address);
}
