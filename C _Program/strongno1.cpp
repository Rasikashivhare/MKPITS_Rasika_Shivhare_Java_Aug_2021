//accept a number and find whether the number is strong or not
#include<stdio.h>
int main()
{
int num=144;
int originalnum=num;
int rem;
int fact;
int sum=0;
while(num!=0)
{

rem=num %10;
//printf("\n remainder=%d,rem)
num=num /10;
//printf("\n num=%d,num);
fact=factorial(rem);
sum=sum+fact;
}
if(originalnum==sum)
{
	printf("\n no[%d]is a strong no.",originalnum);
}
else
{
	printf("\n no[%d]is not a strong no",originalnum);
}
}
//creating a function to cal factorial 
int factorial(int r)
{
	int f=1;
	while(r>0)
	{
		f=f*r;
		r=r-1;
	}
	return f;
}

