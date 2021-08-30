//wap to accept emp name,salary and calculate bonus
#include<stdio.h>
int main()

{
	int salary,bonus;
	char empname;

	printf("enter employee name");
	scanf("%c",& empname);
	printf("enter salary");
	scanf("%d",&salary);
	fflush(stdin);
	if(salary>10000)
	
	{
		printf("\n bonus=1000");
	}
	else if(salary>5000&&salary<10000)
	{
		printf("\n bonus=500");
	
}
	else
	{
	printf("\n bonus=100");	
	}
}
