package com.thread.jion.ch1;

/**
 * 1.2有三个线程ID分别是A、B、C,请有多线编程实现，在屏幕上循环打印10次ABCABC。
 * @Description 
 * @Project: server
 * @Date:2016-12-13
 * @Author dmf
 * @Copyright (c) 2016, 33e9 All Rights Reserved.
 */
public class TestJion {

    /**
     * TODO
     * @param args
     * @throws InterruptedException 
     * @Date:2016-12-13
     * @Author dmf
     */

    public static void main(String[] args) throws InterruptedException {
        System.out.println("---main" + Thread.currentThread().getName());
        Thread a = new Thread(new ThreadA());
        Thread b = new Thread(new ThreadB());
        Thread c = new Thread(new ThreadC());
        a.start();
        a.join();
        b.start();
        b.join();
        c.start();
        c.join();
        System.out.println("---main" + Thread.currentThread().getName());

    }

}
