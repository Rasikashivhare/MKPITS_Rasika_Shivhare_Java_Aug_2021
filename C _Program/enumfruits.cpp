//enum names available in an enum type can havee the same value
#include<stdio.h>
int main(void)
{
	enum fruits{mango=1;strawberry=0,apple=1};
	printf("the value of mango is %d",mango);
	printf("\n the value of apple is %d",apple);
	return 0;
}
