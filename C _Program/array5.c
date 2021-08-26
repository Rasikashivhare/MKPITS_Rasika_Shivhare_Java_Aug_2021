//wap to create an char array of 5 elements to store 5 character 
//accept 5 character from user and store it in an array using for loop
//then display the value stored in an array
#include<stdio.h>
 int main()
 {
 	int i;
 	char ch[5];
 	for(i=0;i<5;i++)
 	{
 		printf("enter character");
 		fflush(stdin);
 		scanf("%c",&ch[i]);
 	}
 	//display value stored in an array
 	{
 		for(i=0;i<5;i++)
 		printf("\n ch[i]=%c",ch[i]);
	 }
	 
 }
