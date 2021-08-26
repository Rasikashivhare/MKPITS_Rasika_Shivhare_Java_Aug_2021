//wap to create an float array of 5 elements to store 5 decimal no 
//accept 5 no from user and store it in an array using for loop
//display the value stored in an array
#include<stdio.h>
int main()
{
	int i;
	float num[5];
	for(i=0;i<5;i++)
	{
		printf("enter no");
		scanf("%f",&num[i]);
	}
	//displaying the value stored in an array
	for(i=0;i<5;i++)
	{
	
	printf("\n num[i]=%f",i,num[i]);
}
}
