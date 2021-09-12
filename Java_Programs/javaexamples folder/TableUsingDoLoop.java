//wap to accept a no and print table of that no using do while
import java.util.Scanner;

public class TableUsingDoLoop
{
    public static void main(String[] args)
    {

        int num;
        int i = 1;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number whose table is to be found: ");
         num = s.nextInt();

        //counting the factorial using while loop
       do
        {

        System.out.println(i*num);
        i++;
	}
	while(i<=10);
    }
}
