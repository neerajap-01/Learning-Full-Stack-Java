package org.example;

import org.example.BlockingQueue.Consumer;
import org.example.BlockingQueue.Producer;
import org.example.CountDownLatch.CountDownLatchDemo;
import org.example.MultiThreads.MyCounter;
import org.example.MultiThreads.MyCounterRunnable;
import org.example.Synchronization.Brackets;
import org.example.ThreadPools.SomeThread;
import org.example.WaitNotify.BankAccount;

import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class Main {
    public static int counter = 0;

    // volatile keyword is used to make sure that the variable is accessed by all threads and
    // not cached by any thread
    volatile public static int flag = 0;

    //!Join
    public static int counter1 = 0;
    public static int counter2 = 0;

    //! Blocking Queue
    public static int counter3 = 0;

    //! Reentrant Lock
    public static int counter4 = 0;
    static Lock lock = new ReentrantLock(); //? This is the lock that we are going to use to implement the reentrant lock

    //! Deadlock
    static Lock lock1 = new ReentrantLock();
    static Lock lock2 = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {

        //! Threads
        /*
        * Threads perform a single task that belongs to a single process. The overview of threads is provided
        * here along with the states of the threads. It is controlled by java.lang.Thread class.
        *
        * A thread is a mini process within a process that can execute or perform operations independently.
        * A thread is a lightweight process. Unlike many other computer languages, Java provides integrated
        * support for multi-threaded programming. A multi-process program contains two or more parts that can
        * be executed simultaneously. Every Java program contains atleast one thread known as the main thread.
        *
        * */

        //? Multi-Threads
        /*
        * A process of executing multiple threads simultaneously is known as Multithreading. However, we use
        * multithreading rather than multiprocessing because threads use a shared memory area. Hence, this
        * saves memory and therefore threads don’t have to allocate separate memory area.
        *
        * Each part of that program is called a subprocess and each subprocess defines a different execution
        * path. Therefore, multithreading is a specialized form of multitasking.
        *
        * In a single-threaded application, only one thread is executed at a time because the application or
        * the program can only handle one task at a time.
        *
        * The following snippet demonstrates that threads exist in several states:
        *
        * 1. New: when we create an instance of the Thread class, a thread is in a new state.
        * 2. Runnable State: Runnable status is a state where the thread is ready to run.
        * 3. Running state: A thread is executing where multi-threaded programming is derived by the hardware.
        * 4. Blocked/ waiting state: A Java thread can be blocked when a resource is expected.
        * 5. Terminated/ dead state: A thread can be terminated, which stops its execution immediately at any time.
        *    Once a thread is finished, it cannot be resumed.
        * */

//        MyCounter counter1 = new MyCounter(1);
//        MyCounter counter2 = new MyCounter(2);
//        MyCounter counter3 = new MyCounter(3);
//        long startTime = System.currentTimeMillis();
//        counter1.start();
//        System.out.println("********************************************");
//        counter2.start();
//        System.out.println("********************************************");
//        counter3.start();
//        sleep(5000);
//        long endTime = System.currentTimeMillis();
//        System.out.println("total time required for processing: "+(endTime-startTime));

        Thread thread = new Thread(new MyCounterRunnable(1));
        Thread thread1 = new Thread(new MyCounterRunnable(2));
//        thread.start();
//        thread1.start();

        //? Anonymous Threads
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    try {
//                        Random random = new Random();
//                        sleep(random.nextInt(1000));
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                    System.out.println("Iteration no: " + i);
//                }
//            }
//        }).start();

        //! Synchronization
        /*
        * Synchronization is the capability to control the access of multiple threads to any shared resource.
        * Java Synchronization is better option where we want to allow only one thread to access the shared
        * resource.
        *
        * Synchronization is mainly used to:
        *  1. Prevent thread interference.
        *  2. Prevent consistency problem.
        *  3. Prevent thread interaction.
        *  4. Prevent deadlock.
        *
        * Java synchronization is a concept where errors can appear in the code if the same entity is shared by
        * two or more threads. Therefore, it can cause different results each time the execution takes place.
        *
        * When we start two or more threads within a program, there may be a situation in which multiple threads
        * try to access the same resource. Therefore, it is necessary to synchronize the action of several threads
        * and make sure that only one thread can access the resource at a given time.
        *
        * As you can see in the following program, that may or may not print a counter value in the sequence and
        * every time it produces a different result based on the availability of the CPU for a thread.
         */

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10000; i++) {
//                    Main.counter++;
//                }
//                System.out.println("Thread no 1 finished");
//            }
//        }).start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10000; i++) {
//                    Main.counter++;
//                }
//                System.out.println("Thread no 2 finished");
//            }
//        }).start();
//        Thread.sleep(1000);
//        System.out.println("Counter: "+Main.counter);

        //? Synchronized Methods

        Brackets brackets = new Brackets();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                long startTime = System.currentTimeMillis();
//                for (int i = 0; i < 5; i++) {
//                    try {
//                        brackets.generate2();
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//                long endTime = System.currentTimeMillis();
//                System.out.println("Total time required by thread 01: "+ (endTime - startTime));
//            }
//        }).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                long startTime = System.currentTimeMillis();
//                for (int i = 0; i < 5; i++) {
//                    try {
//                        brackets.generate2();
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//                long endTime = System.currentTimeMillis();
//                System.out.println("Total time required by thread 01: "+ (endTime - startTime));
//            }
//        }).start();

        //? Synchronized Blocks
        Brackets brackets1 = new Brackets();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                long startTime = System.currentTimeMillis();
//                for (int i = 0; i < 5; i++) {
//                    try {
//                        brackets1.generate2();
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//                long endTime = System.currentTimeMillis();
//                System.out.println("Total time required by thread 01: "+ (endTime - startTime));
//            }
//        }).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                long startTime = System.currentTimeMillis();
//                for (int i = 0; i < 5; i++) {
//                    try {
//                        brackets1.generate2();
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//                long endTime = System.currentTimeMillis();
//                System.out.println("Total time required by thread 01: "+ (endTime - startTime));
//            }
//        }).start();

        //! Volatile Keyword
        /*
        * The volatile keyword is used to declare a variable that can be accessed by all threads. It is also
        * known as a type of synchronization. It is mainly used to prevent thread caching.
        *
        * The volatile keyword is mainly used to synchronize the value of a variable between threads. It is
        * used to make a variable thread-safe. It means that multiple threads can use a method and instance
        * of the class at the same time without any problem.
        *
        * The usage of volatile keyword is used to declare the variables that will be modified by
        * different threads. All changes in the variable will be directly written back to the memory.
        *
        * This keyword cannot be applied to class or method. It can only be used with a variable.
        *
        * In the following program, a non-volatile variable may result in an infinite loop, without
        * volatile variable compiler will re-order the code, free to cache value of volatile variable
        * instead of always reading from main memory.
         */

        //? Check the declaration of flag variable in the Main class
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                int i = 0;
//                while(flag == 0){
//                    System.out.println(i + " : Running...");
//                    i++;
//                }
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                flag = 1;
//                System.out.println("Flag value changed, and thread 1 is stopped");
//            }
//        }).start();

        //! Wait and Notify Methods
        /*
        * The wait() method is used to suspend the current thread and notify() method is used to resume a thread
        * that is suspended by the wait() method. The wait() and notify() methods are used to communicate between
        * threads. The wait() method releases the lock, and the notify() method does not release the lock.
        *
        * The wait() and notify() methods are used to communicate between threads. The wait() method releases the
        * lock, and the notify() method does not release the lock.
        *
        * The basic concept of wait and notify is explained in this tutorial. It tells the calling thread to get rid of the lock
        * and go to sleep until some other threads enter the same monitor and calls notify() method. The wait() method
        * releases the previous lock and reacquires the lock prior to returning from the wait() method.
        *
        * This is a complete example of calling wait and notify method in Java using two threads.
        *
        * We have shared two threads called thread1 and thread2. Inside thread1 we are simply calling the withdraw method
        * and inside thread2 the deposited method.
        *
        * Inside the withdraw method the condition is that if the balance amount is (balance <= 0), we won’t be able to
        * withdraw the amount and we have displayed a message “Waiting for balance updation”.
        *
        * So thread1 will start waiting where we call the withdraw method until thread2 calls the notify method.
        *
        * Inside the deposit method, we are displaying “We are depositing the amount” and update the balance.
        *
        * This inter-thread communication is achieved using wait() and notify() method. Remember wait() and notify() method is
        * defined in the object class, and they must be called inside the synchronized block.
        * When notify() method is called the lock on the wait method would be released. We would be able to perform the operation.
         */

        BankAccount bankAccount = new BankAccount();

        Thread bankThread = new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount.withdraw(1000);

            }
        });
        bankThread.setName("Thread 1");
//        bankThread.start();

        Thread bankThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount.deposit(2000);
            }
        });
        bankThread1.setName("Thread 2");
//        bankThread1.start();

        //! Multithreading Interruptions
        Thread bankThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount.withdraw2(1000);

            }
        });
        bankThread2.setName("Thread 3");
//        bankThread2.start();

        Thread bankThread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                if(bankAccount.deposit2(500)) {
                    System.out.println("Deposit successful");
                } else {
                    bankThread2.interrupt();
                }
            }
        });
        bankThread3.setName("Thread 4");
//        bankThread3.start();

        //! Multithreading Join
        /*
        * The join() method is used to hold the execution of currently running thread until the specified thread is dead.
        * For example, when we are displaying the output of multiple threads, we may want to display the output of one
        * thread first and then the output of another thread. To achieve this, we use the join() method.
         */

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {

                    try {
                        Random random = new Random();
                        sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Iteration no: " + i);
                }
            }
        });
//        thread2.start();
//        thread2.join(); //? This will make sure that the thread2 is finished before the Main thread is executed
//        System.out.println("Thread 2 finished");

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter1++;
                }
            }
        });
//        thread3.start();


        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter2++;
                }
            }
        });
//        thread4.start();

        //? This will make sure that the thread3 and thread4 are finished before executing the thread5
        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread3.join();
                    thread4.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Counter 1: "+counter1);
                System.out.println("Counter 2: "+counter2);
            }
        });
//        thread5.start();
//        System.out.println("This is main thread:- "+Thread.currentThread().getName());

        //! Thread Pools
        /*
        * A thread pool is a collection of threads that can be reused. It is a container that contains a
        * specified number of threads. We can create a thread pool by using the Executors class. It provides
        * factory methods to create different types of thread pools.
        *
        * The thread pool is mainly used to reduce the number of application threads and provide management
        * of the worker threads. The thread pool contains a work queue that holds the tasks waiting to get
        * executed.
        *
        * The thread pool is mainly used to reduce the number of application threads and provide management
        * of the worker threads. The thread pool contains a work queue that holds the tasks waiting to get
        * executed.
        *
        * For example, if we are creating a new thread for every task, it will consume more memory and it will
        * take more time to create and start a new thread. Therefore, we can use the thread pool to reuse the
        * threads and reduce the overhead of creating and starting a new thread.
         */

        //? Thread Pool Executor
        ExecutorService executorService = Executors.newFixedThreadPool(5);

//        for (int i = 1; i <= 10; i++) {
//            executorService.execute(new SomeThread("Thread "+i));
//        }
//        executorService.shutdown(); //? This will make sure that the executor service is shutdown after all the threads are executed

        //! Countdown Latch
        /*
        * A countdown latch is a mechanism that allows a thread to wait until the count reaches zero. It is
        * initialized with a given count. The countdown latch allows one or more threads to wait until the
        * latch reaches the count of zero.
        *
        * The countdown latch is a synchronization mechanism that allows a thread to wait until the count
        * reaches zero. It is initialized with a given count. The countdown latch allows one or more threads
        * to wait until the latch reaches the count of zero.
         */

        CountDownLatch latch = new CountDownLatch(5);
        CountDownLatchDemo countDownLatchDemo = new CountDownLatchDemo(latch);

//        for (int i = 0; i < 5; i++) {
//            new Thread(countDownLatchDemo).start();
//        }
        //? This will make sure that the latch is counted down to zero before the main thread is executed until the latch
        //? is counted down to zero the main thread will wait
//        latch.await();

//        System.out.println("Main thread, "+ Thread.currentThread().getName());

        //! Blocking Queue
        /*
        * A blocking queue is a queue that blocks when we try to dequeue from an empty queue or enqueue
        * items to a full queue. The blocking queue is mainly used to implement the producer-consumer
        * problem. The blocking queue is thread-safe and it can be accessed by multiple threads
        * concurrently.
        *
        * The blocking queue is used as a container for objects when the threads are inserting the objects and other threads
        * are taking the objects out of them. The threads can only continue inserting the objects until a specific limit and
        * take out or use the resources until a specific limit. Therefore, any limit reached by the blocking queue will
        * immediately block the threads.
        *
        * The following program will demonstrate the capability of blocking queues. In order to understand the concept
        * of blocking queue, we will start with the producer and consumer. As the name suggests producer thread adds the
        * element in the queue and the consumer thread consumes the element from the queue. These two thread works
        * simultaneously on blocking queue collection.
        *
        * We have created a producer class that implements the Runnable interface. The producer class will use the put()
        * method to add elements in the queue and before putting a new element the thread will wait for one second.
        *
        * Once the element in the blocking queue reached the maximum limit, instead of terminating the program blocking
        * queue will force the thread to wait until there is an empty space.
         */

        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Thread thread6 = new Thread(new Producer(queue));
//        thread6.start();

        Thread thread7 = new Thread(new Consumer(queue));
//        thread7.start();

        //! Reentrant Lock
        /*
        * The reentrant lock is used to synchronize the critical section of the code. It is an alternative
        * way of synchronized blocks. The reentrant lock is more flexible than the implicit locks used by
        * synchronized methods and blocks.
        *
        * For example, if a thread is waiting for the lock, it can be interrupted. The reentrant lock is
        * created by using the ReentrantLock class. It is a concrete implementation of the Lock interface.
         */
        Thread thread8 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    for (int i = 0; i < 100000; i++) {
                        Main.counter4++;
                    }
                } finally {
                    lock.unlock();
                }
            }
        });

        Thread thread9 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    for (int i = 0; i < 100000; i++) {
                        Main.counter4++;
                    }
                } finally {
                    lock.unlock();
                }
            }
        });

//        thread8.start();
//        thread9.start();
//        thread8.join();
//        thread9.join();

//        System.out.println("Counter 4: "+Main.counter4); //? This will print 200000

        //! Deadlock
        /*
        * A deadlock is a situation where two or more threads are blocked forever, waiting for each other.
        * Deadlock occurs when multiple threads need the same locks but obtain them in different order.
        * A Java multithreaded program may suffer from the deadlock condition because the synchronized keyword
        * causes the executing thread to block while waiting for the lock, or monitor, associated with the
        * specified object.
        *
        * For example, when a thread calls an object’s synchronized method, other threads must wait until the
        * first thread releases the lock. But the first thread never releases the lock because it is waiting
        * for another thread, which is waiting for another thread, and so on. In this case, the waiting threads
        * will wait forever.
        *
        * The following program demonstrates the deadlock condition. In this program, we have created two threads
        * thread1 and thread2. Inside thread1, we have created a synchronized block that acquires the lock on the
        * lock1 object and then sleeps for 1000 milliseconds.
        *
         */

        Thread thread10 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean flagLock01 = false;
                boolean flagLock02 = false;
                while (true){

                    try {
                        flagLock01 = lock1.tryLock(10, TimeUnit.MILLISECONDS);
                        flagLock02 = lock2.tryLock(10, TimeUnit.MILLISECONDS);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        if(flagLock01){
                            System.out.println("Thread1, lock1");
                            lock1.unlock();
                        }
                        if(flagLock02){
                            System.out.println("Thread1, lock2");
                            lock2.unlock();
                        }
                        if (flagLock01 && flagLock02){
                            break;
                        }
                    }
                }

            }
        });

        Thread thread11 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean flagLock01 = false;
                boolean flagLock02 = false;
                while (true) {
                    try {
                        flagLock02 = lock2.tryLock(10, TimeUnit.MILLISECONDS);
                        flagLock01 = lock1.tryLock(10, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        if (flagLock02) {
                            System.out.println("Thread2, lock2");
                            lock2.unlock();
                        }
                        if (flagLock01) {
                            System.out.println("Thread2, lock1");
                            lock1.unlock();
                        }
                        if (flagLock01 && flagLock02) {
                            break;
                        }
                    }
                }
            }
        });

//        thread10.start();
//        thread11.start();
//        thread10.join();
//        thread11.join();
//
//        System.out.println("Main Thread");


    }
}