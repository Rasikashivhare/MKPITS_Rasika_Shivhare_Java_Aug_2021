//wap to create an double  array of 5 elements to store 5 character 
//accept 5 character from user and store it in an array using for loop
//then display the value stored in an array
#include<stdio.h>
 int main()
 {
  int i;
   double num[5];
//acepting 5 character from user
for(i=0;i<5;i++)
{
	printf("enter no");
	fflush(stdin);
	scanf("%lf",&num[i]);
}
//displaying the value stored in an array
for(i=0;i<5;i++)
{
	printf("\n num[i]=%lf",num[i]);
}
}
