//wap to accept 3 no
//and print the smallest no
#include<stdio.h>
int main()
{
	int num1,num2,num3;
	printf("enter three numbers");
	scanf("%d %d %d",&num1,&num2,&num3);
	if(num1 < num2 && num1 < num3)
	{
		printf("%d is smallest",num1);		
}
	else if(num2<num3)
	{
		printf("%d is smallest",num2);		
	}
	else
	{
		printf("%d is smallest",num3);
	}
	return 0;
	
}
