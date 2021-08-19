//wap to accept designation like m,p,c 
//and display the full designation
#include<stdio.h>
void main()
{
	char designation;
	printf("enter designation like m,p,c");
	fflush(stdin);
	scanf("%c",&designation);
	switch(designation)
	{
		case'm':
		printf("\n manager");
		break;
		case'p':
			print("\n peon");
			break;
			case'c':
				printf("\n clerk");
				break;
				default:
					printf("\n invalid operator");
					break;
	}
}
