//WAP to accept 2no and operator like +,-,*
//and then print the result using switch statement
#include<stdio.h>
int main()
{
	int n1,n2,result=0;
	char operator;
	printf("enter 2 no");
	scanf("%d%d",&n1,&n2);
	printf("enter operator like +,-,*");
	fflush(stdin);
	scanf("%c",&operator);
	switch(operator)
	{
		case'+':
			result=n1+n2;
			break;
			case'-':
			result=n1-n2;
			break;
			case'*':
			result=n1*n2;
			break;
			case'/':
			result=n1/n2;
			break;
			case'%':
			result=n1%n2;
			break;
			default:
				printf("\n invalid operator");
				break;			
	}
	printf("\n result=%d",result);
}
