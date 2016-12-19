package com.queue;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * 测试优先级
 * @Description 
 * @Project: server
 * @Date:2016-12-3
 * @Author dmf
 * @Copyright (c) 2016, 33e9 All Rights Reserved.
 */
public class PriorityQueueTest1 {

    public static void main(String[] args) {
        ConcurrentLinkedQueue<String> highPriority = new ConcurrentLinkedQueue<String>(); //高优先级
        ConcurrentLinkedQueue<String> lowPriority = new ConcurrentLinkedQueue<String>(); //低优先级

        highPriority.add("aaa");
        highPriority.add("bbb");
        highPriority.add("111");

        lowPriority.add("ccc");
        lowPriority.add("ddd");
        lowPriority.add("222");

        int i = 0, j = 0, k = 0;
        while (true) {
            while (true) {
                if (!highPriority.isEmpty()) {
                    System.out.print(highPriority.remove());
                    i++;
                    k++;
                    System.out.println(", i = " + i + ", k=" + k);
                    break;
                }
                if (!lowPriority.isEmpty()) {
                    System.out.print(lowPriority.remove());
                    j++;
                    k++;
                    System.out.println(", j = " + j + ", k=" + k);
                    break;
                }
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
