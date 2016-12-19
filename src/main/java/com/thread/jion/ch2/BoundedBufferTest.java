package com.thread.jion.ch2;

public class BoundedBufferTest {

    /**
     * TODO
     * @param args
     * @throws InterruptedException 
     * @Date:2016-12-13
     * @Author dmf
     */

    public static void main(String[] args) throws InterruptedException {
        BoundedBuffer bound = new BoundedBuffer();
        String obj;
        for (int i = 0; i <200; i--) {
            obj = "num" + i;
            bound.put(obj);
        }
        if (bound.count > 0) {
            System.out.println("---:" + bound.take());
        }

    }

}
