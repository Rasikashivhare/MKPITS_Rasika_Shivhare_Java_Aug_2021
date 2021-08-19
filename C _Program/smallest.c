//wap to accept 2 no 
//and display the smallest no
#include<stdio.h>
int main()
{
	int num1,num2,small;
	scanf("%d%d",&num1,&num2);
	if(num1<num2)
	small=num1;
	else
	small=num2;
	printf("\n smallest of two number is:%d",small);
	return 0;	
}
