//wap to accept age 
//and print whether he is minor,young or old 
#include<stdio.h>
void main()
{
	int age;
	printf("enter age");
	scanf("%d",&age);
	if(age<18)
	{
		printf("\n you are minor");		
	}
	else if (age>=18 &&age<40)
	{
		printf("\n you are young");
		}
		else
		{
			printf("\n you are old");
			
		}
}
