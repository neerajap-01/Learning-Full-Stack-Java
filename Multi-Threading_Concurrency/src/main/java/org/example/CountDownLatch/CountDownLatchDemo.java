package org.example.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo extends Thread {
    private CountDownLatch latch;

    public CountDownLatchDemo(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Started Thread, "+ Thread.currentThread().getName());
        System.out.println("Ended Thread, "+ Thread.currentThread().getName());
        System.out.println("**************************************************");
        latch.countDown(); // decrement the count and notify the waiting thread
    }

}
