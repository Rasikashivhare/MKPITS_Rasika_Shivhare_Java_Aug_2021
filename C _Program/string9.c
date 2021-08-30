//once a string is defined ,it cannot be reassigned to another set of characters 
//however using pointers ,we can aasign the set of characters to the string.
#include<stdio.h>
void main()
{
	char*p="hello mkpits";
	printf("before assigning:%s\n",p);
	p="hello";
	printf("after ssigning:%s\n",p);
}
