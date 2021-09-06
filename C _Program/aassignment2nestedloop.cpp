//1 1 1
//2 2
//3
#include<stdio.h>
int main()
{
	int row,col;
	for(row=1;row>0;row--)
	{
		for(col=1;col<=row;col++)
		{
			printf("\t%d",row);
		}
		printf("\n");
	}
}
