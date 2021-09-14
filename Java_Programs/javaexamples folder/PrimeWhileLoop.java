//wap to print prime no using while loop
import java.util.*;

public class PrimeWhileLoop
{

 public static void main(String[] args)
 {

  int givenNumber = 31;
  int n = 2;
  int divisibleCount = 0;;
  while (n <= givenNumber / 2) {
   if (givenNumber % n == 0) {
    divisibleCount++;
    break;
   }
   n++;
  }
  if (divisibleCount == 0 ) {
   System.out.print(givenNumber + " is a prime number ");
  } else {
   System.out.print(givenNumber + " is not a prime number ");
  }

 }
}