package com.queue.blockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Setup {

    /**
     * TODO
     * @param args
     * @Date:2016-12-12
     * @Author dmf
     */

    public static void main(String[] args) {
        BlockingQueue<Object> q = new LinkedBlockingQueue();
        Producer p = new Producer(q);
        Consumer c1 = new Consumer(q);
        Consumer c2 = new Consumer(q);
        new Thread(p).start();
        new Thread(c1).start();
        new Thread(c2).start();

    }

}
