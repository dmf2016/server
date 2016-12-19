package com.queue.blockingQueue;

import java.util.concurrent.BlockingQueue;
import com.queue.bean.User;

public class Consumer implements Runnable {
    private final BlockingQueue queue;
    private volatile boolean stop = false;

    Consumer(BlockingQueue q) {
        queue = q;
    }

    public void run() {
        try {
            while (!stop) {
                consume(queue.take());
            }
        } catch (InterruptedException ex) {
        }
    }

    void consume(Object object) {
        User user = (User) object;
        System.out.println("Consumer:" + user.getName());
    }
}
