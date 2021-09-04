//union declaring union variable inside main function
union data
{
	int i;
	float j;
	char name[10];
	
};
int main()
{
	union data d1;
	d1.i=20;
	printf("\n value of i=%d",d1.i);
	d1.j=22.0f;
	printf("\n value of j=%f",d1.j);
	strcpy(d1.name,"rasika");
	printf("\n  value of name=%s",d1.name);
}
