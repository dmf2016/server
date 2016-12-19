package com.thread.volatile1;

public class PringStringTest {

    /**
     * TODO
     * @param args
     * @throws InterruptedException 
     * @Date:2016-12-2
     * @Author dmf
     */

    public static void main(String[] args) throws InterruptedException {
        PringString runs = new PringString();
        runs.run();
        Thread.sleep(1000);
        System.out.println("----开始停止线程");
        runs.setContinuePrint(false);

        // printStringServer.printStringMethod();
        //System.out.println("我要停止它！stopThread=" + Thread.currentThread().getName());
        //printStringServer.setContinuePrint(false);

    }
}
