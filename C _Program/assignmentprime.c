//wap to accept a no and then print whether it is prime or not
#include <stdio.h>
int main()
{
 
   int n, i, count = 0;
 
    printf("Enter number to check prime number or not");
    scanf("%d",&n);
 
    for(i=2; i<=n/2; ++i)
    {
        if(n%i==0)
        {
            count=1;
            break;
        }
    }
 
    if (count==0)
        printf("%d is a prime number.",n);
    else
        printf("%d is not a prime number.",n);
 
    getch();    
}
