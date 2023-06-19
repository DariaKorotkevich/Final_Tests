package Asem4.exam4.Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Integer> randNum = () -> new Random().nextInt(11);
        System.out.println(randNum.get());
    }
}
