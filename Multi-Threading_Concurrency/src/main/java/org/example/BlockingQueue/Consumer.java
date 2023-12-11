package org.example.BlockingQueue;

import org.example.Main;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer implements Runnable {
    private ArrayBlockingQueue<Integer> queue;

    public Consumer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1500);
                queue.take();
                System.out.println("Value Removed from the queue: "+Main.counter3);
                Main.counter3--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
