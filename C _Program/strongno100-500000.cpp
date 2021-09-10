//wap to print strong no between 100 and 500000
#include<stdio.h>
int main()
{
	int i;
	int num;
	int originalnum;
	int rem;
	int fact;
	int sum=0;
	for(i=100;i<50000;i++)
	{
		sum=0;
		num=i;
		originalnum=num;
		while(num!=0)
		{
			rem=num%10;
			//printf("\n remainder=%d ,remainder);
			num=num/10;
			//printf("\n num=%d,num);
			fact=factorial(rem);
			sum=sum+fact;
			
		}
		if(originalnum==sum)
		{
			printf("\n no[%d]is a strong no.",originalnum);
		}
	
	 } 
}
//create function 
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
