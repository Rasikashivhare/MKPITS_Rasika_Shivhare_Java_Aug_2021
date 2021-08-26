//wap to create an int array of 3 elements to store 3 no
//accept 3 no from user and store it in an array using for loop
//then display the value stored in an array
#include<stdio.h>
 int main()
 {
  int i;
   long int num[3];
//acepting 3 no from user
for(i=0;i<3;i++)
{
	printf("enter no");
	fflush(stdin);
	scanf("%ld",&num[i]);
}
//displaying the value stored in an array
for(i=0;i<3;i++)
{
	printf("\n num[i]=%ld",num[i]);
}
}
