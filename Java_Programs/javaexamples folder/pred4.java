import java.util.function.Predicate;

public class pred4
{
public static void main(String[] args)
{


//lamda exp
Predicate <Integer>predicate1=ar -> ar>100;
Predicate <Integer>predicate2=ar -> ar<200;
Predicate <Integer> and = predicate1.and(predicate2);


boolean test =and.test(118);
System.out.println(test);
}
}
