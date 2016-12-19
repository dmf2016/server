package com.thread.test2;

public class Comsomer extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(" i comsomer :" + i);
            Thread.yield();
        }
    }

}
