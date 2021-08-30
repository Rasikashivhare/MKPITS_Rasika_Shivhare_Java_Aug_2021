//wap to print greater of 3 no
#include<stdio.h>
void main()
{
	int n1,n2,n3;
	printf("\n enter n1");
	scanf("%d",&n1);
	printf("\n enter n2");
	scanf("%d",&n2);
	printf("\n enter n3");
	scanf("%d",&n3);
	
	if(n1>n2 &&n1>n3)
	{
		printf("\n n1 is greater");
	}
	else if(n2>n3)
	{
		printf("\n n2 is greater");
	}
	else
	{
		printf("\n n3 is greater");
	}
}

