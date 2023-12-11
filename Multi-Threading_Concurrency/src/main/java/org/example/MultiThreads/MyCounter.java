package org.example.MultiThreads;

import static java.lang.Thread.sleep;

public class MyCounter extends Thread {
    private int threadNo;

    public MyCounter(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        try {
            countMe();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void  countMe() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            sleep(500);
            System.out.println("Thread no: "+threadNo + " and iteration no: "+i);
        }
    }
}
