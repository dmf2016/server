package com.thread.blockingQueue;

/**
 * 消费者
 * @Description 
 * @Project: server
 * @Date:2016-7-26
 * @Author dmf
 * @Copyright (c) 2016, 33e9 All Rights Reserved.
 */
public class Consumer implements Runnable {
    private String instance;
    private Basket basket;

    public Consumer(String instance, Basket basket) {
        this.instance = instance;
        this.basket = basket;
    }

    public void run() {
        try {
            while (true) {
                // 消费苹果
                System.out.println("消费者准备消费苹果：" + instance);
                System.out.println(basket.consume());
                System.out.println("!消费者消费苹果完毕：" + instance);
                // 休眠1000ms
                Thread.sleep(20);
            }
        } catch (InterruptedException ex) {
            System.out.println("Consumer Interrupted");
        }
    }

}
