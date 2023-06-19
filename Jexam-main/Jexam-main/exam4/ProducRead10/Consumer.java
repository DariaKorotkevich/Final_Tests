package Asem4.exam4.ProducRead10;

import java.util.Queue;
public class Consumer implements Runnable {

    private final Queue<Integer> queue;

    public Consumer(Queue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.isEmpty()) {
                    try {
                        System.out.println("Queue is empty, waiting for producer...");
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int num = queue.poll();
                System.out.println("Consuming: " + num);
                queue.notifyAll();
            }
        }
    }
}
