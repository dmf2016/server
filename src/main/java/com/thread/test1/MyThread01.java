package com.thread.test1;

/**
 * 通过return停止线程
 * @Description 
 * @Project: server
 * @Date:2016-7-27
 * @Author dmf
 * @Copyright (c) 2016, 33e9 All Rights Reserved.
 */
public class MyThread01 extends Thread {

    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()) {
                System.out.println("停止了。");
                return;
            }
            System.out.println("time:" + System.currentTimeMillis());
        }
    }

    /**
     * TODO
     * @param args
     * @throws InterruptedException 
     * @Date:2016-7-27
     * @Author dmf
     */

    public static void main(String[] args) throws InterruptedException {
        MyThread01 thread = new MyThread01();
        thread.start();
        Thread.sleep(100);
        thread.interrupt();
    }
}
