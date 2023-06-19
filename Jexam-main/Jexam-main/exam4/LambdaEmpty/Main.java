package Asem4.exam4.LambdaEmpty;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String str = "Hello, world!";
        Predicate<String> isNotEmpty = s -> !s.isEmpty();
        boolean result = isNotEmpty.test(str);
        System.out.println(result);
    }
}
