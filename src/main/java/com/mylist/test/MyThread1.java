package com.mylist.test;

public class MyThread1 extends Thread {
    private Object lock;

    public MyThread1(Object lock) {
        this.lock = lock;
    }

    public void run() {
        try {
            synchronized (lock) {
                System.out.println(" 开始----wait:" + System.currentTimeMillis());
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + ",打印：" + i);
                }
                lock.wait();
                // System.out.println(" 结束----wait:" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }// end try
    }
}
