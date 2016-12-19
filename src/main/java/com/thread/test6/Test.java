package com.thread.test6;

public class Test {

    /**
     * TODO
     * @param args
     * @throws InterruptedException 
     * @Date:2016-7-27
     * @Author dmf
     */

    public static void main(String[] args) throws InterruptedException {
        PublicVar publicVar = new PublicVar();
        Thread athread = new ThreadA(publicVar);
        athread.start();
        Thread.sleep(100);
        publicVar.getValue();

    }

}
