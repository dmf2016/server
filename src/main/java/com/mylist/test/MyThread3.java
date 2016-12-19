package com.mylist.test;

public class MyThread3 extends Thread {
    private Object lock;

    public MyThread3(Object lock) {
        this.lock = lock;
    }

    public void run() {
        synchronized (lock) {
            System.out.println(" 开始----notify:" + System.currentTimeMillis());
            lock.notify();
            //lock.notifyAll();//唤醒所有线程
            System.out.println(" 结束----notify:" + System.currentTimeMillis());
        }
    }

}

