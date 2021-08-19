//wap to accept a character 
//and display whether it is vowel or not
int main()
{
	char ch;
	printf("enter character");
	scanf("%c",&ch);
	switch(ch)
	{
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		printf("\n character is vowel");
		break;
		
		default:
		printf("\n character is not vowel");
		break;
	}
}
