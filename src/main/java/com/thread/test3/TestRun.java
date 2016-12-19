package com.thread.test3;
public class TestRun {
    /**
     * TODO
     * @param args
     * @Date:2016-7-27
     * @Author dmf
     */

    public static void main(String[] args) {
        Thread.currentThread().setPriority(6);
        Thread testThread = new TestThread1();
        testThread.start();
    }
}
