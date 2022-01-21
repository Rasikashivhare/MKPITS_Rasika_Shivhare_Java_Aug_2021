import java.util.function.Predicate;

public class pred6
{
public static void main(String[] args)
{


//lamda exp
Predicate <Integer>predicate1=ar -> ar>5;
Predicate <Integer> negate =predicate1.negate();
boolean test =negate.test(3);
System.out.println(test);
}
}
