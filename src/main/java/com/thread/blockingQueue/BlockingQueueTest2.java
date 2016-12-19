package com.thread.blockingQueue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 多线程模拟实现生产者／消费者模型
 * @Description 
 * @Project: server
 * @Date:2016-7-26
 * @Author dmf
 * @Copyright (c) 2016, 33e9 All Rights Reserved.
 */
public class BlockingQueueTest2 {

    public static void main(String[] args) {
        BlockingQueueTest2 test = new BlockingQueueTest2();

        // 建立一个装苹果的篮子
        Basket basket = new Basket();

        ExecutorService service = Executors.newCachedThreadPool();
        Producer producer = new Producer("生产者001", basket);
        Producer producer2 = new Producer("生产者002", basket);
        Consumer consumer = new Consumer("消费者001", basket);
        service.submit(producer);
        service.submit(producer2);
        service.submit(consumer);

    }

}
