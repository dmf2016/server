package com.queue.thread;

/**
 * 启动模拟在线程池里插入一条消息
 * @Description 
 * @Project: server
 * @Date:2016-12-3
 * @Author dmf
 * @Copyright (c) 2016, 33e9 All Rights Reserved.
 */
class InsertMsg extends Thread {
    private ThreadExecutor threadExecutor;
    private int count = 0;

    public InsertMsg(ThreadExecutor threadExecutor) {
        this.threadExecutor = threadExecutor;
    }

    @Override
    public void run() {
        // 模拟3次消息插入
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(ThreadExecutor.sdf.format(System.currentTimeMillis()) + "插入消息～～～～插入队列第" + (++count)
                    + "条消息！");
            threadExecutor.singleThreadExecutor.execute(getRunnablePriority(count));
        }
    }

    // 模拟插入消息数据
    private RunnablePriority getRunnablePriority(final int count) {
        return new RunnablePriority(3) {

            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(ThreadExecutor.sdf.format(System.currentTimeMillis()) + "插入消息～～～～插入第" + count
                        + "条消息！");
            }
        };
    }
}
