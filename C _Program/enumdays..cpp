//create a simple program of enum
#include<stdio.h>
enum weekdays{
sunday=1,monday,tuesday,wednesday,thursday,friday,saturday};
int main()
{
	enum weekdays w;//variable declaration of weekdays type//assigning value of monday to w.
	w=monday;
	printf("the value of w is %d",w);
	return 0;
}
