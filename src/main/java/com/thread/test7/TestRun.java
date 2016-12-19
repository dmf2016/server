package com.thread.test7;

public class TestRun {

    /**
     * TODO
     * @param args
     * @Date:2016-7-27
     * @Author dmf
     */

    public static void main(String[] args) {
        try {
            DealThread t1 = new DealThread();
            t1.setUsername("a");
            Thread thread1 = new Thread(t1);
            thread1.start();
            Thread.sleep(10);
            t1.setUsername("b");
            Thread thread2 = new Thread(t1);
            thread2.start();

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
