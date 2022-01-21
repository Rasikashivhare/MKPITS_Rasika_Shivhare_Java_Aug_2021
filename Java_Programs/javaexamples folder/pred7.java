import java.util.function.Predicate;

public class pred7
{
static boolean checksingledigit(int a,Predicate<Integer> predicate1)
{
	return predicate1.test(a);
}
public static void main(String[] args)
{


//lamda exp
//Predicate <Integer>predicate1=ar -> ar>5;
//Predicate <Integer> negate =predicate1.negate();

//boolean test =negate.test(3);

boolean checksingledigit =checksingledigit(12,c->c<10);

System.out.println(checksingledigit);
}
}
