//1 
//1 3
//1 3 5
#include<stdio.h>
int main()
{
	int row,col;
	for(row=1;row<=3;row++)
	{
		for(col=1;col<=row;col++)
		{
			printf("\t%d",col);
		}
		printf("\n");
	}
}
