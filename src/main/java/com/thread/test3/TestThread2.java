package com.thread.test3;
public class TestThread2 extends Thread {
    public void run() {
        System.out.println(" TestThread2 is priority :" + this.getPriority());
    }
}
