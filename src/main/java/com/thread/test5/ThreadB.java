package com.thread.test5;

public class ThreadB extends Thread {
    private HasSelfPrivateNum num;

    public ThreadB(HasSelfPrivateNum nums) {
        super();
        this.num = nums;
    }

    public void run() {
        super.run();
        num.addI("b");
    }

}
