//wap to create a function calculate with 3 parameters(2 int one char to accept 2 no.and operator )
//and  calculate and display the result.
#include<stdio.h>
void calculate(int n1,int n2,char op)
{
	int result;
	switch(op);
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
					
	}
	printf("\n result =%d",result);
}
int main()
{
	int n1,n2;
	char op;
	printf("enter 2 no");
	scanf("%d%d",&n1,&n2);
	printf("enter operator like +,-,*");
	fflush(stdin);
	
	calculate(n1,n2,op);
	printf("\n bye from main function");
}
}
