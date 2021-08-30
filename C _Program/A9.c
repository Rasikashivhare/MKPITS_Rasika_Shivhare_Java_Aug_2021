//wap to accept emp name and designation and salary calculate bonus
#include<stdio.h>
int main()
{
	int salary,bonus;
 char empname,designation;
 printf("enter salary");
 scanf("%d",&salary);
 printf("enter employee name");
 scanf("%c",&empname);
 printf("enter designation");
 scanf("%c",&designation);
 fflush(stdin);
 switch(designation)
 {
 	case'p':
 		printf("\n bonus=1000");
 		break;
 		case'q':
 			printf("\n bonus=100");
 			break;
 			default:
 				printf("\n invalid designation");
 				break;
 }
 printf("\n bonus=%d",bonus);
}
