package com.queue.blockingQueue;

import java.util.concurrent.BlockingQueue;
import com.queue.bean.User;

/**
 * 生产者
 * @Description 
 * @Project: server
 * @Date:2016-12-12
 * @Author dmf
 * @Copyright (c) 2016, 33e9 All Rights Reserved.
 */
public class Producer implements Runnable {
    private final BlockingQueue queue;
    private volatile boolean stop = false;

    Producer(BlockingQueue q) {
        queue = q;
    }

    public void run() {
        try {
            while (!stop) {
                User user = new User();
                user.setName("学生1");
                queue.put(user);
            }
        } catch (InterruptedException ex) {
        }
    }

}
