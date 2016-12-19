package com.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class RunnableDemo7 {
    public static void main(String[] args) {

        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(2, 10, 1, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(3));
        for (int i = 0; i < 6; i++) {
            threadPool.execute(new TestRunning("R" + i, 5));
        }
    }
}
