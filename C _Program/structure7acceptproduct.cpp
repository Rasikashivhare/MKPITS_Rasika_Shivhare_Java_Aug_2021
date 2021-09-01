//create a structure product with members productid,productname,price and accept the values from the userto store employee record in structure
struct employee
{
	int productid;
	char productname[10];
    float price;
};
int main()
{
	struct product pro1;
	printf("enter productid ");
	scanf("%d",&pro1.productid);
	printf("enter product name ");
	scanf("%s",&pro1.productname);
	printf("enter product price");
	scanf("%f",&p1.productprice);
	printf("\n product details are ");
	printf("\n productid=%d",pro1.productid);
	printf("\n productname=%s",pro1.productname);
	printf("\n price=%f",pro1.price);
		
}
