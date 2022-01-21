import java.util.function.Predicate;

public class pred5
{
public static void main(String[] args)
{


//lamda exp
Predicate <Integer>predicate1=ar -> ar>5;
Predicate <Integer>predicate2=ar -> ar==0;
Predicate <Integer> and = predicate1.or(predicate2);


boolean test =or.test(4);
System.out.println(test);
}
}
