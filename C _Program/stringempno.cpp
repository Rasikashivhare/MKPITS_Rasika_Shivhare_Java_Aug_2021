//wap to accept empno,firstname,lastname,designation and slary of the employee nad display it
#include<stdio.h>
int main()
{
	int empno;
	char firstname[20];
	char lastname[20];
	char designation[20];
	float salary;
	printf("enter empno");
	scanf("%d",&empno);
	printf("enter first name");
	fflush(stdin);
	gets(firstname);
	printf("enter last name");
	fflush(stdin);
	gets(lastname);
	printf("enter designation");
	fflush(stdin);
	gets(designation);
	printf("enter salary");
	scanf("%f",&salary);
	printf("\n employee details are .");
	printf("\nempno=%d",empno);
	printf("\nfirstname=%d",firstname);
	printf("\n lastname=%d",lastname);
	printf("\n designation=%s",designation);
	printf("\n0salary=%f",salary);
}
	

