import java.util.function.Predicate;

public class pred3
{
public static void main(String[] args)
{
Predicate <Integer> predicate=new Predicate<Integer>()
{
@Override
public boolean test(Integer t)
{
System.out.println(t);
return true;
}
};

boolean test =predicate.test(200);
System.out.println(test);


//lamda exp
Predicate <Integer>predicate3=ar-> ar>100;
boolean test =predicate3.test(200);
System.out.println(test);
}
}
