////wap to create a variable num and store value 5 in it
//then create a pointer and store the adrress of num variable and print the value of num variable using pointer
#include<stdio.h>
int main()
{
	int num=5;
	int *ptr;
	ptr=&num;
	printf("value in num=%d",*ptr);
}
