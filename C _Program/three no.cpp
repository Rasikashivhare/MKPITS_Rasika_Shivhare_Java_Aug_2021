//wap to accept 3no 
//and print total and average
#include<stdio.h>
main()
{
	int n1,n2,n3,total;
	float average;
	printf("enter 3 person age");
	scanf("%d%d%d",&n1,&n2,&n3);
	total=n1+n2+n3;
	average=total/3;
	printf("/n total age of 3 person=%d",total);
	printf("/n average age of 3 person=%d",average);
}
