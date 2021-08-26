//wap to create an int array of 3 elements to store 3 no 
//accept 3 from the user and store it in an array
//sum the elements of an array and display the sum
#include<stdio.h>
int main()
{
	int i; 
	int num[3];
	int sum=0;
	for(i=0;i<3;i++)
	{
		printf("enter no");
		scanf("%d",&num[i]);
		sum =sum +num[i];
		
	}
	printf("\n sum of elements of an array=%d",sum);
}
