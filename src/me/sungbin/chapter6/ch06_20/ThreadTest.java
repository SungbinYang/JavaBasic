package me.sungbin.chapter6.ch06_20;

class MyThread implements Runnable {

    @Override
    public void run() {
        int i;

        for (i = 1; i <= 200; i++) {
            System.out.print(i + "\t");
        }
    }

//    @Override
//    public void run() {
//        int i;
//
//        for (i = 1; i <= 200; i++) {
//            System.out.print(i + "\t");
//        }
//    }

}

public class ThreadTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread() + " start");

        MyThread runnable = new MyThread();
//        MyThread th1 = new MyThread();
//        MyThread th2 = new MyThread();

//        th1.start();
//        th2.start();

        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);

        th1.start();
        th2.start();

        System.out.println(Thread.currentThread() + " end");

        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("run");
            }
        };
        run.run();
    }
}
