//wap to create function result with 3 int parameters to accept 3 subject marks calculate 
//and display total,percentage and grade
#include<stdio.h>
void result(int s1,int s2 ,int s3)
{
	int result,total;
	float percentage;
	total=s1+s2+s3;
	printf("\n total marks=%d",total);
	percentage=(total/300.0f)*100.0f;
	printf("\n percentage=%.2f",percentage);
	if(percentage>=75)
	{
		printf("\n grade=distinction");
	}
	else if(percentage>=60&&percentage<75)
	{
		printf("\n grade= first");
	}
	else
	{
		printf("\n grade=pass");
	}
}
int main()
{
	int s1,s2,s3,total;
	float percentage;
	printf("\n enter marks of 3 subjects");
	scanf("%d%d%d",&s1,&s2,&s3);
	result(s1,s2,s3);
	printf("\n bye from main function");
}



