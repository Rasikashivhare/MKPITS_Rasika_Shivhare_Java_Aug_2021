//wap to create an integer array of 3 elements to store 3 no and accept 3 no from user
//store it in an array and then display the value stored in an array
#include<stdio.h>
int main()
{
	int num[3];
	printf("enter no");
	scanf("%d",&num[0]);
	printf("enter no");
	scanf("%d",&num[1]);
	printf("enter no");
	scanf("%d",&num[2]);
	//displaying the value stored in an array
	printf("\n num[0]=%d",num[0]);
	printf("\n num[1]=%d",num[1]);
	printf("\n num[2]=%d",num[2]);
}
