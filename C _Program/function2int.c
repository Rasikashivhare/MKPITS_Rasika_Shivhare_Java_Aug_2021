//wap to create a function sum with 2 int parameter and write code in it to add and display the addition of 2 no
 //accepting no from user
 void sum(int num1,int num2)
 {
 	int result=num1+num2;
 	printf("\n addition of a no =%d",result);
 }
 int main()
 {
 	int num1,num2;
 	printf("enter 2 number");
 	scanf("%d%d",&num1,&num2);
 	sum(num1,num2);
 	printf("\n bye from main function");
 	
 }
