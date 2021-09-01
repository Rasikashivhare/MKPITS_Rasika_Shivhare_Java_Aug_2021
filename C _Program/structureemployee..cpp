//create a structure employee  with members empno,empname,designation and salary.
struct employee
{
	int empno;
	char empname[10];
	char designation[10];
	float salary;
 } ;
  int main()
  
  {
  	struct employee e1;
  	//assigning values to structure members
  	e1.empno=123;
  	strcpy(e1.empname,"harish");
  	strcpy(e1.designation,"recruiter");
  	e1.salary=10000.0f;
  	//displaying the values
  	printf("\n empno=%d",e1.empno);
  	printf("\n empname=%s",e1.empname);
  	printf("\n designation=%s",e1.designation);
	printf("\n salary=%f",e1.salary); 	
  }
