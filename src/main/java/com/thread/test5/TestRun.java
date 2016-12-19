package com.thread.test5;

public class TestRun {

    /**
     * TODO
     * @param args
     * @Date:2016-7-27
     * @Author dmf
     */

    public static void main(String[] args) {
        HasSelfPrivateNum nums = new HasSelfPrivateNum();
        Thread athread = new ThreadA(nums);
        athread.start();
        Thread bthread = new ThreadB(nums);
        bthread.start();

    }

}
