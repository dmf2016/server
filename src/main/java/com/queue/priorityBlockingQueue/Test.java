package com.queue.priorityBlockingQueue;

import java.text.ParseException;

public class Test {
    public static void main(String[] args) throws ParseException, InterruptedException {

        FileUtil timeFile = new FileUtil("C:\\zjh\\time.txt");
        FileUtil jobFile = new FileUtil("C:\\zjh\\job.txt");

        timeFile.init();
        jobFile.init();

        PutJOBTest.put(timeFile, jobFile);

        GetJOBTest.get(timeFile, jobFile);

        timeFile.destory();
        jobFile.destory();
    }

}
