package com.thread.jion.ch1;

public class ThreadB implements Runnable {
    private volatile boolean stop = false;

    @Override
    public void run() {
        while (!stop) {
            System.out.println("B");
        }
    }

}
