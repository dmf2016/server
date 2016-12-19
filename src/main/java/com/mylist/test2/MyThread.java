package com.mylist.test2;

public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    public void run() {
        myService.testMethod();
    }
}
