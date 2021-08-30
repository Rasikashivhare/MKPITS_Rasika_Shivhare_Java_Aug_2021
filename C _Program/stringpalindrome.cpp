
//wap to find whether string is palindrome or not
#include<string.h>
int main()
{

	char name[30];
	char orgname[30];
	char revname[30];
	
	printf("enter firstname");
	gets(name);
	strcpy(orgname,name);
	printf("\n org name=%s",orgname);
	strrev(name)
	printf("\n after rev name=%s",name);
	if (strcmp(orgname,name)==0){
		printf("\n string is palindrome");
	}
	else{
		printf("\n string is not palindrome");
	}
}
