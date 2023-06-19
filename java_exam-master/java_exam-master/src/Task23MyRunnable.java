public class Task23MyRunnable implements Runnable {
    int a;

    public Task23MyRunnable(int a) {
        this.a = a;
    }

    @Override
    public void run() {
            for (int i = 0; i <= 100; ++i) {
                if (i % 10 == 0)
                    System.out.print(i + " " + a + "    ");
                a++;
            }
            System.out.println("\n");
    }

    public static void main(String[] msi) throws InterruptedException {
        int a = 0;
        for (int i = 0; i < 3; i++){
            new Task23MyRunnable(a).run();
            Thread.sleep(1000);
        }

    }
}