public class Task22MyThread extends Thread {
    StringBuilder sb;

    public Task22MyThread(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; ++i)
            System.out.print(i + "" + sb + "    ");
    }

    public static void main(String[] msi) {
        StringBuilder sb = new StringBuilder("a");
        new Task22MyThread(sb).start();
    }
}