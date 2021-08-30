//wap in c to check whether a number is a palindrome or not
#include<stdio.h>
int main()
{
	int num,originalnum,remainder,reversed=0;
	printf("enter a number");
	scanf("%d",&num);
	originalnum=num;
	while(num!=0)
	{
		remainder=num %10;
		reversed=reversed*10+remainder;
num /=10;
	}
	if(originalnum==reversed){
	
	printf("%d is an palindrome number ",originalnum);
}
else
{
	printf("%d is not an palindrome number ",originalnum);
	return 0;
}
}
