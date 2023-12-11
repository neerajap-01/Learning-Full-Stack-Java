package org.example.MultiThreads;

import java.util.Random;

import static java.lang.Thread.sleep;

public class MyCounterRunnable implements Runnable {
    private int threadNo;

    public MyCounterRunnable(int threadNo) {
        this.threadNo = threadNo;
    }

    public int getThreadNo() {
        return threadNo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Random random = new Random();
                sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread no: " + threadNo + " and iteration no: " + i);
        }
    }
}
