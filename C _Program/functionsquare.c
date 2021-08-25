//wap to create a function square to accept  no. and display the square of that no.
#include<stdio.h>
//creating a function sum
void square()
{
	int n1,square;
	printf(" enter no");
	scanf("%d",&n1);
	square=n1*n1;
	printf("\n square of no =%d",square);
}

int main()
{
	//calling the function 
	square();
		printf("\n bye from main function");
}
