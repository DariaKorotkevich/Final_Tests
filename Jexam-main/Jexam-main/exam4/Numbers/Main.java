package Asem4.exam4.Numbers;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        Function<Integer, String> checkNum = n ->{
            if(n>0){return "Положительное число";}
            else if (n<0){return  "Отрицательное число";}
            else {return "Ноль";}
        };
        System.out.println(checkNum.apply(num));
    }
}
