//enum example of months
#include<stdio.h>
enum months{jan=1,feb,march,april,may,june,august,september,october,november,december};
int main()
{
	for(int i=jan;i<=december;i++)
	{
		printf("%d,",i);
	}
	return 0;
}
