package org.example.Synchronization;

public class Brackets {
    synchronized public static void generate() { // synchronized keyword is used to make sure that only one thread can access this method at a time
        for (int i = 0; i < 20; i++) {
            if(i <= 10) {
                System.out.print("[");
            } else {
                System.out.print("]");
            }
        }
        System.out.println();
    }

    final private Object lock = "Lock"; // this is the object that we are going to use to implement the monitor lock

    public void generate2() throws InterruptedException {
        //*Synchronized is done by Java using a concept called monitor i.e Intrinsic Lock or Monitor Lock
        //* Intrinsic Lock is an object level lock
        //* Intrinsic Lock is associated with an object
        //* Intrinsic Lock is acquired automatically when a thread enters a synchronized block
        //* This is how we implement synchronized monitor lock:

        synchronized(lock){ // private variable key is used to make sure that only one thread can access this method at a time
            for (int i = 0; i < 20; i++) {
                if (i <= 10) {
                    System.out.print("[");
                } else {
                    System.out.print("]");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < 20; i++) {
            Thread.sleep(10);
        }
    }
}
