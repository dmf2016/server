package com.thread;

public class TestRunning implements Runnable {
    private String name;
    private int count;

    public TestRunning(String name, int i) {
        this.name = name;
        this.count = i;
    }

    public void run() {
        while (count > 0) {
            System.out.println("----s--" + name + ",count:" + count);
            count--;
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
