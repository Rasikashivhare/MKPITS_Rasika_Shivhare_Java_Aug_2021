//displaying corrupted values of i and j
union data{
	int i;
	float j;
	char name[20];
};
int main()
{
	union data d1;

	printf("enter value of i(int value)");
	scanf("%d",&d1.i);
//	printf("\n value of i=%d",d1.i);
	printf("enter value of j(float value)");
	scanf("%f",&d1.j);
//	printf("\n value of j=%f",d1.j);
	printf("\n enter  value of name");
	scanf("%s",&d1.name);
	printf("\n value of i=%d",d1.i);
	printf("\n value of j=%f",d1.j);
	printf("\n value of name=%s",d1.name);
	
	}
