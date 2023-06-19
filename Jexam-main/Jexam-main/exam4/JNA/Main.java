package Asem4.exam4.JNA;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        String str = "JavA";
        Predicate<String> startsWithJorN = s -> s.startsWith("J") || s.startsWith("N");
        Predicate<String> endsWithA = s -> s.endsWith("A");
        boolean result = startsWithJorN.and(endsWithA).test(str);
        System.out.println(result);
    }
}
