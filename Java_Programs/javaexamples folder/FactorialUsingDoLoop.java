//wap to accept a no and print factorial of that no using do while
import java.util.Scanner;

public class FactorialUsingDoLoop
{
    public static void main(String[] args)
    {

        int fact = 1;
        int i = 1;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number whose factorial is to be found: ");
        int num = s.nextInt();

        //counting the factorial using while loop
        do
        {
            fact = fact * i;
            i++;
        }
        while(i<=num);
        {

        System.out.println("\nFactorial of " + num + " is: " + fact);
    }
}
}
