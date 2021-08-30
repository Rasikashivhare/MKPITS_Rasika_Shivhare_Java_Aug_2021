//wap to accept a no and print factorial of that number
#include<stdio.h>
int main()
{

int num,fact=1;
	printf("enter number");
	scanf("%d",&num);
	while(num>0)
	{
		fact=fact*num;
		num=num-1;
		
	}
	printf("\n factorial of a number is %d",fact);
}
