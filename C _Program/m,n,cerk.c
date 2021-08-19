//wap to accept basicsalary and designation like 'm' for manager,c for clerk and'p' for peon
//and then calculate bonus=1000 for'm',500for 'c',100 for'p'
//and display basicsalary,bonus and totalsalary
#include <stdio.h> 
int main() {
int	basicsalary,bonus=0,total=0;
	char designation;
	printf("enter basic salary");
	scanf("%d",&basicsalary);
	fflush(stdin);
	printf("enter designation like m,c,p");
	scanf("%c",&designation);
	if(designation=='m') {
		bonus=1000;
	}
	else if (designation=='c' ){
		bonus=500;
	}
	else if(designation=='p') {
		bonus=100;
	}
	total=basicsalary + bonus;
	printf("\n basic salary = %d",basicsalary);
	printf("\n bonus = %d",bonus);
	printf("\n total salary = %d",total);
return 0;	
}
