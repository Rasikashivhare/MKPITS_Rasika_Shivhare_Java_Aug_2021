//wap to accept 2 no and display the smallest no
#include<stdio.h>
#include<conio.h>
int main()
{
    int a, b, small;
    printf("Enter any two number: ");
    scanf("%d%d", &a, &b);
    if(a<b)
        small=a;
    else
        small=b;
    printf("\nSmallest of the two number is: %d", small);
    getch();
    return 0;
}
