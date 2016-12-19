package com.thread.volatile1;

public class Run {

    /**
     * TODO
     * @param args
     * @throws InterruptedException 
     * @Date:2016-7-27
     * @Author dmf
     */

    public static void main(String[] args) throws InterruptedException {
        RunThread t1 = new RunThread();
        t1.start();
        Thread.sleep(1000);
        t1.setRunning(false);
        System.out.println("已赋值false.");

    }

}
