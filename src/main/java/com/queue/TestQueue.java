package com.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestQueue {

    /**
     * TODO
     * @param args
     * @Date:2016-7-26
     * @Author dmf
     */

    public static void main(String[] args) {
        Queue<String> queue = new ArrayBlockingQueue<String>(10);
        for (int i = 0; i < 10; i++) {
            queue.add("a" + i);
        }
    }

}
