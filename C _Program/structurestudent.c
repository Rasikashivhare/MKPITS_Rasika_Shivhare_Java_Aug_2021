//create a structure  student with members rno,name,course,address,mobileno
struct student
{
	int studentrno;
	char name[10];
	char course[10];
	char address[10];
	float mobileno;
};
int main()
{
	struct student s1;
	//assigning values to structure members
	s1.studentrno=123;
	strcpy(s1.name,"rasika");
	strcpy(s1.course,"btech");
	strcpy(s1.address,"nandanvan");
	s1.mobileno=112.2f;
	//displaying the values stored in structures
	printf("\n studentrno=%d",s1.studentrno);
	printf("\n name=%s",s1.name);
	printf("\n course=%s",s1.course);
	printf("\n address=%s",s1.address);
	printf("\n mobileno=%f",s1.mobileno);
}
