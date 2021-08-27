//wap to serach an element in an array(create an array of 5 elements and store 5 numbers in it)
//then accept a number from user and find whether that no in array or not
#include<stdio.h>
int main()
{
	int arr[5]={1,2,3,4,5};
	int i,num;
	printf("enter number to be searched in an array");
	scanf("%d",&num);
	for(i=0;i<5;i++)
	{
		if(num==arr[i])
		{
			printf(" number found at element [%d]",num-1);
			break;
		}
		
	}
	if(i==5)
	{
		printf("number not found in array");
	}
}
