//wap  in c to display the n terms of even natural and their sum 
//eg input number of terms:5
#include<stdio.h>
 int main()
 {
 	int i,n,sum=0;
 	printf("input number of terms :");
 	scanf("%d",&n);
 	printf("\n the even natural numbers are :");
 	for(i=1;i<=n;i++)
 	{
 		printf("%d",2*i);
 		sum+=2*i;
 		
	 }
	 printf("\n sum of even natural number upto %d terms:%d \n",n,sum);
 }


