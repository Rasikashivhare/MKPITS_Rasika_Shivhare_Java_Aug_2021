//wap to create function calarea with one int parameter to accept radius,calculate 
//display area and circ of circle
#iinclude<stdio.h>
void calarea(int r)
{
	float pi=3.14,area,circ;
}
int main()
{
	int r;
	float pi=3.14,area,circ;
	printf("\n enter radius");
	scanf("%d",&r);
	area=pi*r*r;
	circ=2*pi*r;
	printf("\n area of circle=%.2f",area);
	printf("\n circ of circle=%.2f",circ);
	printf("\n bye from main function");
}
