//function with parameter and returning nothing(void)
//wap to create a function factorial with one int parameter,calculate and display the factorial of that number
#include<stdio.h>
void factorial(int n1)
{
	int fact=1;
	while(n1>0)
	{
		fact=fact*n1;
		n1--;
	}
	printf("\n result=%d",fact);
}
int main()
{
	int n1;
	printf("\n enter no");
	scanf("%d",&n1);
	//calling the function calculate and passing argument
	factorial(n1);
	printf("\n bye from main function");
}
