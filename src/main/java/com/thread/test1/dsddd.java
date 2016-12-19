package com.thread.test1;

public class dsddd {

    public static void main(String[] args) throws Exception {
        MyThreadTest myThread = new MyThreadTest() {
            protected void runPersonelLogic() {
                System.out.println("myThead is running");
            }
        };
        myThread.start();
        Thread.sleep(3000);
        myThread.setSuspend(true);
        System.out.println("myThread has stopped");
        Thread.sleep(3000);
        myThread.setSuspend(false);
    }

}
