//create a structure employee with members empid,empname,designation,salary and accept the values from the userto store employee record in structure
struct employee
{
	int empid;
	char empname[10];
	char designation[10];
    float salary;
};
int main()
{
	struct employee emp1;
	printf("enter empid");
	scanf("%d",&emp1.empid);
	printf("enter emp name");
	scanf("%s",&emp1.empname);
	printf("enter designation");
	scanf("%s"&emp1.designation);
	printf("enter salary");
	scanf("%f",&emp1.salary);
	printf("\n employee details are ");
	printf("\n empid=%d",emp1.empid);
	printf("\n empname=%s",emp1.empname);
	printf("\n designation=%s",emp1.designation);
	printf("\n salary=%f",emp1.salary);
		
}
