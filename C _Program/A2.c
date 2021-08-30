//wap in c to display the n terms of square natural number and their sum for eg-1,4,9,16.....n terms
#include<stdio.h>
int main()
 {
 	int i,n,sum=0;
 	printf(" The input number of terms are: ");
 	scanf("%d",&n);
 	printf("\n the square natural number are:");
 	for(i=1;i<=n;i++)
 	{
 		printf("%d",i*i);
 		sum+=i*i;
	 }
	 printf("\n sum of square of natural number upto %d=%d \n",n,sum);
 	
 	
 }
