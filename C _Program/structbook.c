//create a structure book with memebers bookid,title,author and price
struct book
{
	int bookid;
	char title[10];
	char author[10];
	float price;
	
};
int main()
{
	struct book b1;
	//assigning values to structure members
	b1.bookid=123;
	strcpy(b1.title,"oracle");
	strcpy(b1.author,"bill");
	b1.price=112.2f;
	//displaying the values stored in structures
	printf("\n bookid=%d",b1.bookid);
	printf("\n title=%s",b1.title);
	printf("\n author=%s",b1.author);
	printf("\n price=%f",b1.price);
}
