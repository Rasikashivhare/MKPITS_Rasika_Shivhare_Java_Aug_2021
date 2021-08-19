//wap to accept basicsal and designation 
//and calculate bonus 1000 for m, 500 for c, 100 for p
#include<stdio.h>

int main()
{
int basicsal,bonus,total;
char designation;
printf("enter basic salary ");
scanf("%d",&basicsal);
printf("enter designation like m,p,c.");
fflush(stdin);
scanf("%c",&designation);
switch(designation)
{
case 'm':
bonus=1000;
break;
case 'p':
bonus=500;
break;
case 'c':
bonus=100;
break;
default:
printf("\n invalid designation ");
break;

}
total=basicsal+bonus;
printf("\n bonus = %d",bonus);
printf("\n total = %d",total);

}
