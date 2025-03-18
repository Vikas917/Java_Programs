/*
    Thread -
            In Java, a thread is a lightweight process that allows multiple tasks to be executed concurrently.

There are 2 methods in java to create thread -

(1) By extending thread class
(2) By implementing the Runnable Interface

You can also control threads using methods like:

    start() – Starts the thread.
    run() – Contains the code that runs when the thread is started.
    sleep(ms) – Puts the thread to sleep for the specified number of milliseconds.
    join() – Waits for the thread to die.
    interrupt() – Interrupts the thread.
    isAlive() – Checks if the thread is alive.
 */

package Java_Basics;


//  Creating a Java Thread by extending the thread class
class MyThread extends Thread {
    //Constructors from thread class in java
    public MyThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("This is " + this.getName());
//        while (true) {
//            System.out.println("This is " + this.getName());
//        }
    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("I am Sad");
        }
    }
}

class Greet extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Good Morning");
        }
    }
}
class Meet extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(50);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Night");
    }
}

//  Creating a Java Thread Using Runnable Interface

class MyThreadRunnable implements Runnable {
    public void run() {
        int i = 0;
        while (i  <= 1000){
            System.out.println("I am a thread from Runnable1");
        }
    }
}
class MyThreadRunnable2 implements Runnable {

    public void run() {
        int j = 0;
        while (j <= 1000) {
            System.out.println("I am a thread from Runnable in 2");
        }
    }
}



public class MultiThreading {
    public static void main(String[] args) {
        Greet g = new Greet();
        Meet m = new Meet();
        m.start();
        g.start();

//        MyThread t1 = new MyThread("Thread 1 (MOST IMPORTANT THREAD");
//        MyThread t2 = new MyThread("Thread 2 (Least)");
//        MyThread t3 = new MyThread("Thread 3");
//        MyThread t4 = new MyThread("Thread 4");
//        MyThread t5 = new MyThread("Thread 5");
//        t1.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);
//        t1.start();
//        t2.start();
//        t3.start();
//        //t3.start();
//        t4.start();
//        t5.start();
//        t5.setPriority(Thread.NORM_PRIORITY);
//        System.out.println("Thread ID is " + t1.getId());
//        System.out.println("Thread name is " + t1.getName());
//        MyThread2 t2 = new MyThread2();
//        System.out.println("Thread ID is " + t2.getId());
//        t1.start();
//        t2.start();

//        MyThreadRunnable bullet1 = new MyThreadRunnable();
//        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
//        Thread gun1 = new Thread(bullet1);
//        Thread gun2 = new Thread(bullet2,"R2");
//        System.out.println(Thread.currentThread().getName());
//        gun1.start();
//        gun2.start();
    }
}
