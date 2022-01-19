import java.util.Optional;
public class nul2

{
public static void main(String[] args){
String s[]=new String[5];
s[0]="rasi";
Optional<String> nonemptyOptional=Optional.ofNullable(s[1]);
Optional<String> emptyOptional=Optional.empty();

String orElse =emptyOptional.orElse("spring");
System.out.println(orElse);

//Optional.

//s[1]="shubhm";
//System.out.println(s[0].toUpperCase());
//System.out.println(s[2].toUpperCase());
//Optional<String> empty=Optional.empty();
//System.out.println(empty);


}
}