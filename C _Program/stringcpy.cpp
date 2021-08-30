//wap to copy one string to another (strcpy)
#include<string.h>
int main()
{
	char ch1[15];
	char ch2[15];
	int length;
	printf("enter string");
	gets(ch1);
	strcpy(ch1,ch2);
	printf("\n string1=%s",ch1);
	printf("\n string2=%s",ch2);
}
