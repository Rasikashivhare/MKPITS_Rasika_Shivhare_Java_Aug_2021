import java.util.Arrays;
public class sort 
{

public static void main(String[] args){
int numbers[]={22,89,1,32,19,5};

// parallel sort method for sorting array
Arrays.parallelSort(numbers,1,5);

for(int x:numbers)
{
System.out.println(x);
}

// //converting arrays to stream and display using foreach
//Arrays.stream(numbers).foreach(n->System.out.println(n+" "));
}
}
