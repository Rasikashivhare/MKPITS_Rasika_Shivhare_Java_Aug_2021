//wap to accept 5 subject marks then calculate total,per and grade
#include <stdio.h>

int main()
{
    int phy, chem, bio, math, comp; 
    float per; 
    printf("Enter five subjects marks: ");
    scanf("%d%d%d%d%d", &eng, &math, &sci, &hist, &comp);

    per = (eng + math + sci + hist + comp) / 5.0;

    printf("Percentage = %.2f\n", per);
    if(per >= 90)
    {
        printf("Grade A");
    }
    else if(per >= 80)
    {
        printf("Grade B");
    }
    else if(per >= 70)
    {
        printf("Grade C");
    }
    else if(per >= 60)
    {
        printf("Grade D");
    }
    else if(per >= 40)
    {
        printf("Grade E");
    }
    else
    {
        printf("Grade F");
    }

    return 0;
}

}   
