//example of continue statement
import java.util.*;
class ContinueStatement
{
public static void main(String[] arg)
{
int num[] = {1,2,3,4,5 ,6,7}; //array of 5 elements
//enhanced for loop or for each loop
for(int n : num) {

if(n==3) {

continue;
}
System.out.println("num = " + n);

}

}

}