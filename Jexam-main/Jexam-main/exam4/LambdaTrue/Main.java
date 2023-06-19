package Asem4.exam4.LambdaTrue;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        String str = "Hello, world!";
        Predicate<String> predicate = s -> s != null;
        boolean result = predicate.test(str);
        System.out.println(result);
    }
}