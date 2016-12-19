package com.thread.test2;

public class Producer extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(" i a :" + i);
            Thread.yield();
        }
    }
}
