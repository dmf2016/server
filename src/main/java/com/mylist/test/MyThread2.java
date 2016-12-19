package com.mylist.test;

public class MyThread2 extends Thread {
    private Object lock;

    public MyThread2(Object lock) {
        this.lock = lock;
    }

    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ",打印：" + i);
            }
            System.out.println(" 开始----notify:" + System.currentTimeMillis());
            lock.notify();
            //lock.notifyAll();//唤醒所有线程
            System.out.println(" 结束----notify:" + System.currentTimeMillis());
        }
    }

}
