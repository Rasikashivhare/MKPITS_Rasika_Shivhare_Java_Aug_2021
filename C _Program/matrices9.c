//wap of multiplication o marices
//2 create array of 2 rows and and 4 cols and store some value in it and display the values
int main()
{
	int arr1[3][3];
	int arr2[3][3];
int r,col;
for(r=0;r<3;r++)
{
	for(col=0;col<3;col++)
	{
		arr2[col][r]=arr1[r][col];
		
	}
	}	
	printf("\n arr1 \n");
	for(r=0;r<3;r++)
	{
		for(col=0;col<3;col++)
		{
			printf("\t%d",arr1[r][col]);
			
		}
		printf("\n");
	}
	printf("\n arr2(transpose interchanging of rows and col)\n");
		for(r=0;r<3;r++)
	{
		for(col=0;col<3;col++)
		{
			printf("\t%d",arr2[r][col]);
			
		}
		printf("\n");
	}
	
}
