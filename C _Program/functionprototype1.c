//example of function prototype
//wap to create afunction factorial,cal factorial and return the factorial
#include<stdio.h>
//declaring a function prototype
float calculatearea();
//creating a main function
int main()
{
	float result;
	result=calculatearea();
	printf("\n area=%f",result);
}
float calculatearea()
{
	int radius;
	float area;
	printf("enter radius");
	scanf("%d",&radius);
	area=3.14*radius*radius;
	return area;
}
