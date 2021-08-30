//wap to check whether a given number is armstrong or not
#include<stdio.h>
int main()
{
	int num,originalnum,remainder,result=0;
	printf("enter 3-digit number");
	scanf("%d",&num);
	originalnum=num;
	while(originalnum !=0)
	{
		remainder=originalnum %10;
		result +=remainder*remainder*remainder;
		originalnum /=10;
	}
	if(result==num){
	
	printf("%d is an armstrong number ",num);
}
else
{
	printf("%d is not an armstrong number ",num);
}
}
