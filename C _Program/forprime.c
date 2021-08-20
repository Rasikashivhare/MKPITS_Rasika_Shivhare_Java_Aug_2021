//wap to accept a no and print whether it is prime or not
#include<stdio.h>
int main(){
	int num,result,i;
	printf("entern number");
	scanf("%d",&num);
	for (i=2;i<num;i++)
	
	{
		if(num%i==0)
	
	{
		
	
	printf("\n not a prime no" );
	break;

}
}
if(i==num)
{
	printf("\n no is prime");
}
}

