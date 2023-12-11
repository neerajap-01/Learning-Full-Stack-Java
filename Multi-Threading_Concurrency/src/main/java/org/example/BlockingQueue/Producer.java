package org.example.BlockingQueue;

import org.example.Main;

import java.util.concurrent.ArrayBlockingQueue;

public class Producer implements Runnable {
    private ArrayBlockingQueue<Integer> queue;

    public Producer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(1000);
                queue.put(Main.counter3);
                System.out.println("Value added in the queue: " + Main.counter3);
                Main.counter3++;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
