package com.thread.threadPoolManager;

import java.util.concurrent.ThreadPoolExecutor;

public class TestThreadPool {

    public static void main(String[] args) {
        /*
         * 使用方法：
         * WorkerItem可以是一个需要添加到线程中执行的任务
         */
        WorkerItem runnable = new WorkerItem();
        //start(runnable);
        //destroy();
        ThreadPoolManager executor =  ThreadPoolManager.newInstance();
        executor.addExecuteTask(runnable);
        System.out.println("--启动--");
    }

}
