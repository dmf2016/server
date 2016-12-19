package com.queue.thread;

/**
 * 启动模拟不断加入新消息数据
 * @Description 
 * @Project: server
 * @Date:2016-12-3
 * @Author dmf
 * @Copyright (c) 2016, 33e9 All Rights Reserved.
 */
public class AddMsg extends Thread {
    private ThreadExecutor threadExecutor;
    private int count = 0;

    public AddMsg(ThreadExecutor threadExecutor) {
        this.threadExecutor = threadExecutor;
    }

    @Override
    public void run() {
        // 模拟10次消息添加
        for (int i = 0; i < 10; i++) {
            System.out.println(ThreadExecutor.sdf.format(System.currentTimeMillis()) + "加入消息～～～加入队列第" + (++count)
                    + "条消息！");
            threadExecutor.singleThreadExecutor.execute(getRunnablePriority(count));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 模拟不断加入的新消息数据
    private RunnablePriority getRunnablePriority(final int count) {
        return new RunnablePriority(5) {

            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(ThreadExecutor.sdf.format(System.currentTimeMillis()) + "加入消息～～～加入第" + count
                        + "条消息！");
            }
        };
    }
};
