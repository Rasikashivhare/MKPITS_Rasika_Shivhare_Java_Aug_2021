//wap to accept basic salary
//and then calculate bonus
#include<stdio.h>
int main()
{
	int basicsalary,bonus=0;
	printf("enter basic salary");
	scanf("%d",&basicsalary);
	if(basicsalary>=10000){
		bonus=1000;
	}
	else if(basicsalary>=5000 && basicsalary<10000)
	{
		bonus=500;
	}
	else
	{
		bonus=100;
	}
	printf("\n bonus=%d",bonus);
	return 0;
}
