//wap to accept length and breadth of rectangle 
//and print area of rectangle
#include<stdio.h>
void main()
{
	int length,breadth,area;
	printf("enter length and breadth");
	scanf("%d%d",&length,&breadth);
	area=length*breadth;
	printf("\n area of rectangle=%d",area);
}
