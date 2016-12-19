package com.thread.test5;
public class ThreadA extends Thread {
    private HasSelfPrivateNum num;
    public ThreadA(HasSelfPrivateNum nums) {
        super();
        this.num = nums;
    }
    public void run() {
        super.run();
        num.addI("a");
    }
}
