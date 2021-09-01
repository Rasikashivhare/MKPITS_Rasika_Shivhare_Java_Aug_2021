//create a structure product with productid,productname,productprice
struct product
{
	int productid;
	char productname[10];
	float productprice;
	
};

int main()
{
	struct product p1;
	p1.productid=123;
	strcpy(p1.productname,"oracle");
	p1.productprice=1000.0f;
	//displaying the values
	printf("\n productid=%d",p1.productid);
	printf("\n productname=%s",p1.productname);
	printf("\n productprice=%f",p1.productprice);
}
