package task25;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Fork fork1 = new Fork("fork1");
        Fork fork2 = new Fork("fork2");
        Fork fork3 = new Fork("fork3");
        Fork fork4 = new Fork("fork4");
        Fork fork5 = new Fork("fork5");

        Philosopher philosopher1 = new Philosopher("Descartes", fork1, fork2);
        Philosopher philosopher2 = new Philosopher("Nietzsche", fork2, fork3);
        Philosopher philosopher3 = new Philosopher("Kant", fork3, fork4);
        Philosopher philosopher4 = new Philosopher("Hume", fork4, fork5);
        Philosopher philosopher5 = new Philosopher("Plato", fork5, fork1);

        philosopher1.start();
        philosopher2.start();
        philosopher3.start();
        philosopher4.start();
        philosopher5.start();

        Thread.sleep(60000);
    }
}
