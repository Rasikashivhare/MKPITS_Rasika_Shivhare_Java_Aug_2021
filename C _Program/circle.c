//wap to accept radius of circle 
//print area and circumference of circle
#include<stdio.h>
void main()
{
	int radius;
	float area,circ, pi=3.14f;
	printf("enter radius");
	scanf("%d",&radius);
	area=pi*radius*radius;
	circ=2*pi*radius;
	printf("\n area of circle=%2f",area);
	printf("\n circ of circle =%2f",circ);
}
