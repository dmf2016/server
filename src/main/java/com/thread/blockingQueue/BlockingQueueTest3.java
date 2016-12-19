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
public class BlockingQueueTest3 {

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        // 建立一个装苹果的篮子
        Basket basket = new Basket();
        long beginTime = System.currentTimeMillis();
        Producer producer;
        for (int i = 0; i < 100; i++) {//100个产生者
            producer = new Producer("生产者" + i, basket);
            service.submit(producer);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("生产用时：" + (endTime - beginTime)+",微秒");
        Consumer consumer;
         beginTime = System.currentTimeMillis();
        for (int i = 0; i < 30; i++) {
            consumer = new Consumer("消费者" + i, basket);
            service.submit(consumer);
        }
         endTime = System.currentTimeMillis();
        System.out.println("消费用时：" + (endTime - beginTime)+",微秒");

    }

}
