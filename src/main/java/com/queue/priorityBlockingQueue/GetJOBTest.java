package com.queue.priorityBlockingQueue;

import java.util.concurrent.CountDownLatch;

/**
 * 5. 现在我们再写一个模拟获取队列任务（队列顶任务被获取后，
 * PriorityBlockingQueue会对剩下的任务进行实时排序）的测试类，模拟100个线程（人员），
 * 每个线程人员）不间断的获取4000笔任务，即总共获取40万笔的任务。将消耗的时间存到日志中，
 * 使用CountDownLatch阀门来统计20个线程执行完40万任务的总消耗时间和平均消耗时间。
 * @Description 
 * @Project: server
 * @Date:2016-12-3
 * @Author dmf
 * @Copyright (c) 2016, 33e9 All Rights Reserved.
 */
public class GetJOBTest {
    public static void get(FileUtil timeFile, FileUtil jobFile) throws InterruptedException {

        CountDownLatch cdl = new CountDownLatch(50);
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            new Thread(new GetThread(cdl, timeFile, jobFile)).start();
        }
        cdl.await();
        System.out.println("ALL GET JOB Use time:" + (System.currentTimeMillis() - beginTime));
        System.out.println("ALL GET JOB AVG time:" + (System.currentTimeMillis() - beginTime) / 400000);
    }

    static class GetThread implements Runnable {
        private CountDownLatch cdl;
        private FileUtil timeFile;
        private FileUtil jobFile;

        public GetThread(CountDownLatch cdl, FileUtil timeFile, FileUtil jobFile) {
            this.cdl = cdl;
            this.timeFile = timeFile;
            this.jobFile = jobFile;
        }

        @Override
        public void run() {
            for (int i = 0; i < 4000; i++) {
                long beginTime = System.currentTimeMillis();
                JOBVO job = PriorityQueueManager.get();
                timeFile.write("" + (System.currentTimeMillis() - beginTime));
                //jobFile.write("Get JOB: " + job);
            }
            cdl.countDown();
        }
    }
}
