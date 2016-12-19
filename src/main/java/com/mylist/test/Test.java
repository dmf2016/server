package com.mylist.test;

public class Test {

    /**
     * TODO
     * @param args
     * @throws InterruptedException 
     * @Date:2016-7-28
     * @Author dmf
     */

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        MyThread1 t1 = new MyThread1(lock);
        MyThread2 t2 = new MyThread2(lock);
        t1.start();
        t2.start();
        

    }

}
