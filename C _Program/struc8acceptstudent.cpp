//create a structure student members with rno,name,address ,mobileno  and accept the values from the userto store employee record in structure
struct student
{
	int studentrno;
	char studentname[10];
	char address[10];
    float mobileno;
};
int main()
{
	struct student s1;
	printf("enter student rno");
	scanf("%d",&s1.studentrno);
	printf("enter student name");
	scanf("%s",&s1.studentname);
	printf("enter address");
	scanf("%s"&s1.address);
	printf("enter mobileno");
	scanf("%f",&s1.mobileno);
	printf("\n student details are ");
	printf("\n studentrno=%d",s1.studentrno);
	printf("\n studentname=%s",s1.studentname);
	printf("\n address=%s",s1.address);
	printf("\n mobileno=%f",s1.mobileno);
		
}
