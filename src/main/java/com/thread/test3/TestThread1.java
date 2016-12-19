package com.thread.test3;
public class TestThread1 extends Thread {
    public void run() {
        System.out.println(" TestThread1 is priority :" + this.getPriority());
        Thread testThread2 = new TestThread2();
        testThread2.start();
    }
}
