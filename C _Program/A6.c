//wap to accept 3 subject marks and print total,percentage and grade
#include<stdio.h>
int main()
{
	int s1,s2,s3,total;
	float percentage;
	printf("enter marks");
	scanf("%d%d%d",&s1,&s2,&s3);
	total=s1+s2+s3;
	printf("\n total marks=%d",total);
	percentage=(total/300.0f)*100.0f;
	printf("\n percentage of marks=%2f",percentage);
	if(percentage>75)
	{ 
	printf("\n grade =distinction");

}
else if(percentage>60&&percentage<75 )
{
	printf("\n grade= first");
	
}
else
{
	printf("\n grade = fail");
}
}
