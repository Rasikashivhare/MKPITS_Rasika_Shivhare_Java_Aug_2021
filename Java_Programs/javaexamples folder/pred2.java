import java.util.function.Predicate;

public class pred2
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

//lamda exp
Predicate <Integer>predicate2=ar-> ar>100;
boolean test =predicate2.test(200);
System.out.println(test);
}
}
