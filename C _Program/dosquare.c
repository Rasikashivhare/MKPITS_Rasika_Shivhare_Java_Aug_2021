//wap to accept a number and print square of that number
#include<stdio.h>
int main()
{
	int num,square;
	char ans;
	do
	{
		printf("\n enter number");
		scanf("%d",&num);
		square=num*num;
		printf("\square of a number=%d",square);
		printf("\n do you want to continue if press y otherwise n");
		fflush(stdin);
		scanf("%d",&ans);
		
	}
	while(ans=='y');
	printf("\nbye");
}
