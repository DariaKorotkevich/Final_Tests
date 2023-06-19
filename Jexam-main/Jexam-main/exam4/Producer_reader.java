package Asem4.exam4;

import static java.lang.Thread.sleep;

public class Producer_reader {
    private static int result = 0;
    private static volatile boolean ready = false;

    public static void main(String[] args) {
        Runnable producer = () -> {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            result = 42;
            ready = true;

        };
        Runnable reader = () -> {
            while (!ready) ;
            System.out.println(result);
        };
        new Thread(reader).start();
        new Thread(producer).start();
    }
}