// wap to accept a no. print factorial of that no.
int main() 
{
int num,fact=1;
printf("enter number");
scanf("%d",&num); 

while(num > 0)
 {
fact=fact * num;
num=num-1;
}
printf("\n factorial of a number is %d",fact);
}
