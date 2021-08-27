//create a 2d array of 2 rows and 2 columns and accept the values from user and store it and display the values
#include<stdio.h>
int main()
{
	int arr[2][2];
	int row,col;
	for(row=0;row<2;row++)
	{
		for(col=0;col<2;col++)
		{
			printf("enter number");
			scanf("%d",&arr[row][col]);
			
		}
	}
		//display the values
		for(row=0;row<2;row++)
		{
			for(col=0;col<2;col++)
			{
				printf("%d",arr[row][col]);
				
			}
			printf("\n");
		}
	}	

