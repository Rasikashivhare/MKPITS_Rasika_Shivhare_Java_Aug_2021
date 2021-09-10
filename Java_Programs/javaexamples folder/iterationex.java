//BreakDemo program:

import java.util.*;
class iterationex
{
public static void main(String[] arg)
{
int num[] = {1,2,3,4,5 ,6,7}; //array of 5 elements
//enhanced for loop or for each loop
for(int n : num) {
System.out.println("num = " + n);
if(n==3) {

break;
}
}
}
}