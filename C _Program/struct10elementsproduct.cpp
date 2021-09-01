//wap to create a structure array of 10 elements of structure product
//creating a structure student with members bookid,title,author pass this structure to function
//display to display structure values
struct product
{
	int productid;
	char name[20];
	float price;
	
};
//creating function declaration
void display(struct product p1);
#include<stdio.h>
int main()
{
	struct product p1[10];
	int i=0;
	while(i<10)
	{
		
	printf("enter productid");
	scanf("%d",&p1[i].productid);
	printf("enter name");
	scanf("%s",&p1[i].name);
	printf("enter price");
	fflush(stdin);
	scanf("%f",&p1[i].price);
	printf("\n product[%d]details are",i+1);
	display(p1[i]);//passing structure to function
	i++;
}
}
//creating function display with structure parameter
void display(struct product p1)
{
	printf("\n productid=%d",p1.productid);
	printf("\n name=%s",p1.name);
	printf("\n price=%f",p1.price);
}
