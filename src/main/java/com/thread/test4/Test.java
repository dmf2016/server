package com.thread.test4;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread daemonThread = new Thread(new ThreadDemo());
        daemonThread.setName("测试thread");
        // 设置为守护进程
        daemonThread.setDaemon(true);
        daemonThread.start();
        Thread.sleep(1000);
        System.out.println("isDaemon = " + daemonThread.isDaemon());
        //Thread t = new Thread(new ThreadDemo());
        //t.start();
    }
}
