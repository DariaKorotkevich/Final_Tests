package Asem4.exam4.Printable;

public class Main {
    public static void main(String[] args) {
        Printable printable = Main::printHello;
        printable.print();
    }

    public static void printHello() {
        System.out.println("Hello World!");
    }
}
