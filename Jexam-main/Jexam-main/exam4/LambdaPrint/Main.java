package Asem4.exam4.LambdaPrint;

public class Main {

    public static void main(String[] args) {
        Printable printable = () -> System.out.println("Hello, world!");
        printable.print();
    }
}

interface Printable {
    void print();
}