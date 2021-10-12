//Example to instantiate Multidimensional Array in Java

import java.util.*;
class array1
{

public static void main(String args[]){

Scanner scan=new Scanner(System.in);
int[][] arr=new int[3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.println("enter number");
arr[i][j]=scan.nextInt();
}
}
//display
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(arr[i][j] + " ");

}
System.out.println();

}

}}