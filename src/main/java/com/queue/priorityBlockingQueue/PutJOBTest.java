package com.queue.priorityBlockingQueue;

import java.util.Date;
import java.util.concurrent.CountDownLatch;

public class PutJOBTest {
    public static void put(FileUtil timeFile, FileUtil jobFile) throws InterruptedException {

        CountDownLatch cdl = new CountDownLatch(20);

        long beginTime = System.currentTimeMillis();

        for (int i = 0; i < 20; i++) {

            new Thread(new PutThread(cdl, timeFile, jobFile)).start();

        }

        cdl.await();

        System.out.println("ALL PUT JOB Use time:" + (System.currentTimeMillis() - beginTime));
        System.out.println("ALL PUT JOB AVG time:" + (System.currentTimeMillis() - beginTime) / 400000);

    }

    static class PutThread implements Runnable {
        private CountDownLatch cdl;
        private FileUtil timeFile;
        private FileUtil jobFile;

        public PutThread(CountDownLatch cdl, FileUtil timeFile, FileUtil jobFile) {
            this.cdl = cdl;
            this.timeFile = timeFile;
            this.jobFile = jobFile;
        }

        @Override
        public void run() {
            for (int i = 0; i < 20000; i++) {

                Date date = DateUtil.getRandomDate();

                long beginTime = System.currentTimeMillis();

                JOBVO job = new JOBVO("1", date);

                PriorityQueueManager.add(job);

                timeFile.write("" + (System.currentTimeMillis() - beginTime));
                //jobFile.write("Put JOB: " + job);
            }

            cdl.countDown();
        }
    }
}
