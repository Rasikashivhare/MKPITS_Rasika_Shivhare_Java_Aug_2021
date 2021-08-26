//wap to create an integer array of 5 to store 5 no 
//accept 5 no from user and store it in an array using for loop
//display the value stored in an array
#include<stdio.h>
int main()
{
	int i;
	int num[5];
	for(i=0;i<5;i++)
	{
		printf("enter no");
		scanf("%d",&num[i]);
	}
	//displaying the value stored in an array
	for(i=0;i<5;i++)
	{
	
	printf("\n num[i]=%d",num[i]);
}
}
