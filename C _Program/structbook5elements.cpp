//wap to create a structure array of 5 elements of structure book
//creating a structure student with members bookid,title,author pass this structure to function
//display to display structure values
struct book
{
	int bookid;
	char title[20];
	char author[20];
	
};
//creating function declaration
void display(struct book b1);
#include<stdio.h>
int main()
{
	struct book b1[5];
	int i=0;
	while(i<5)
	{
		
	printf("enter bookid");
	scanf("%d",&b1[i].bookid);
	printf("enter title");
	scanf("%s",&b1[i].title);
	printf("enter author");
	fflush(stdin);
	gets(b1[i].author);
	printf("\n book[%d]details are",i+1);
	display(b1[i]);//passing structure to function
	i++;
}
}
//creating function display with structure parameter
void display(struct book b1)
{
	printf("\n bookid=%d",b1.bookid);
	printf("\n title=%s",b1.title);
	printf("\n author=%s",b1.author);
}
