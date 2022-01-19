import java.util.Optional;

public class excpt{
public static void main(String[] args)
{
Optional<String> nonemptyOptional=Optional.of("java");
Optional<String> emptyOptional=Optional.empty();

//orElseThrow() -Return the contained value,if present,otherwise
//throw an exception to be created by the provided supplier.
/*-------------------------------------------------*/

System.out.println(nonEmptyOptional.orElseThrow(NullPointerException::new));//java
System.out.println(emptyOptional.orElseThrow(NullPointerException::new));//NullPointerException

}
}



