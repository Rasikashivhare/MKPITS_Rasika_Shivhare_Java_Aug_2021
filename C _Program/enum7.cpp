//enumerated data type without the name also
#include<stdio.h>
enum{success,fail}status;
int main(void){
	status=success;
	printf("the value of status is %d",status);
	return 0;
}
