//create a 2d array of 3 rows and 3 columns
#include<stdio.h>
int main()
{
	int arr[3][3];
	int row,col;
	for(row=0;row<3;row++)
	{
		for(col=0;col<3;col++)
		{
			printf("enter number");
			scanf("%d",&arr[row][col]);
		}
		
	}
	//display the values
	for(row=0;row<3;row++)
	{
		for(col=0;col<3;col++)
		{
			printf("\t %d",arr[row][col]);
			
		}
		printf("\n");
	}
}
