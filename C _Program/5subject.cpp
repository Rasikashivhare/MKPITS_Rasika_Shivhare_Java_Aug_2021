//wap to accept 5 subject marks
//and then calculate total,per,and grade
void main()
{
int s1,s2,s3,s4,s5,total;
float percentage;
printf("enter 5 subject marks");
scanf("%d%d%d%d%d",&s1&s2&s3,s4,s5);
total=s1+s2+s3+s4+s5;
printf("\n total marks=%d",total);
percentage=(total/500.0f)*100.0f;
printf("\n percentage=%.2f",percentage);
if (percentage>=75)
{
	printf("|n grade=distinction");
}
else if(Percentage>=60&&percentage<75)
{
	printf("\n grade=first");
}
else if(percentage>=40&&percentage<60)
{
	printf("\n grade=second");
}
else
{
	printf("\n grade=fail");
}
}

