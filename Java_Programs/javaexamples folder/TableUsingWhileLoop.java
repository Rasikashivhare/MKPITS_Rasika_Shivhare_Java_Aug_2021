//wap to accept a no and print table of that no
import java.util.Scanner;

public class TableUsingWhileLoop
{
    public static void main(String[] args)
    {

        int num;
        int i = 1;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number whose table is to be found: ");
         num = s.nextInt();

        //counting the factorial using while loop
        while( i <= 10 )
        {

        System.out.println(i*num);
        i++;
	}
    }
}
