package com.thread.test4;

public class ThreadDemo implements Runnable {
    private int i = 0;

    public void run() {
        while (true) {
            try {
                i++;
                System.out.println("i=" + i);
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
