package com.queue.priorityBlockingQueue;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityQueueManager {
    private static PriorityBlockingQueue queue = new PriorityBlockingQueue();

    public static void add(JOBVO job) {

        queue.add(job);
    }

    public static JOBVO get() {

        return (JOBVO) queue.poll();
    }

    public static int size() {
        return queue.size();
    }
}
