package com.thread.test2;

public class TestDemo {

    /**
     * TODO
     * @param args
     * @Date:2016-7-27
     * @Author dmf
     */

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Thread producer = new Producer();
        Thread comsomer = new Comsomer();
        producer.setPriority(Thread.MIN_PRIORITY);
        comsomer.setPriority(Thread.MIN_PRIORITY);
        producer.start();
        comsomer.start();

    }

}
