package com.entity;

public class ThreadC extends Thread {
    private C c;

    public ThreadC(C c) {
        this.c = c;
    }

    public void run() {
        while (true) {
            c.setValue();
        }
    }

}
