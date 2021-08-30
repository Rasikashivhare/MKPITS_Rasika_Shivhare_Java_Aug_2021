//wap to check whether a given number is perfect number or not
//input the number:56
#include <stdio.h>
void main()
{
	int n,i,sum;
	int mn,mx;
	printf("input the  number :");
	scanf("%d",&n);
	sum=0;
	printf("the positive divisor are:");
	for(i=1;i<n;i++)
	{
		if(n%1==0)
		{
			sum=sum+i;
			printf("%d",i);
			
		}
	}
	printf("\n sum of the divisor is:%d",sum);
	if(sum==n)
	printf("\n so,the number is perfect.");
	else
	printf("\n so,the number is not perfect.");
	printf("\n");
	
}
