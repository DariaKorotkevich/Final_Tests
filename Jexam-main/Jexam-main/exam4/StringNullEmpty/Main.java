package Asem4.exam4.StringNullEmpty;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String str = "Hello world!";
        Predicate<String>notNull = s -> s != null;
        Predicate<String>notEmpty = s -> !s.isEmpty();
        boolean result = notNull.and(notEmpty).test(str);
        System.out.println(result);

    }
}
