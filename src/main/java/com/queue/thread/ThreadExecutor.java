package com.queue.thread;

import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池队列插队Demo，自定义线程池然后使用PriorityBlockingQueue类实现，但是有个问题，
 * 每次加入新消息时，是和队头比较，如果和队头的优先级一样则放在队头的后面～～
 * 比如：队列5 4 4 4 4  <--(4)  放入后则变成5 (4) 4 4 4 4或者5 4 (4) 4 4 4。不会出现5 4 4 4 4 (4) 
 * 
 * @author dmf
 *
 */

public class ThreadExecutor {
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss::SSS");
    public ExecutorService singleThreadExecutor = new FinalizableDelegatedExecutorService(new ThreadPoolExecutor(1, 1,
            0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue<Runnable>()));

    public static void main(String[] args) {
        ThreadExecutor threadExecutor = new ThreadExecutor();
        AddMsg addMsg = new AddMsg(threadExecutor);// 启动模拟不断加入新消息数据
        InsertMsg insertMsg = new InsertMsg(threadExecutor);// 启动模拟在线程池里插入一条消息
        // 这里不用担心队列的问题
        addMsg.start();
        insertMsg.start();
    }

}
