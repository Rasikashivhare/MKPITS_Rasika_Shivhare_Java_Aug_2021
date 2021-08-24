//example of goto statement in c to do calculation
#include<stdio.h>
int main()
{
	int n1,n2,res;
	char op;
	printf("enter 2 no");
	scanf("%d%d",&n1,&n2);
	fflush(stdin);
	printf("enter opeartor like +,-,*");
	scanf("%c",&op);
	if(op=='+')
	{
		goto add;
	}
	//creating labels for goto  statement
	add:
		printf("\nsub");
		mul:
			printf("\nbye");
			end:
				printf("nbye");
}
