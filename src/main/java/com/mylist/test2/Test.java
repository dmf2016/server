package com.mylist.test2;

public class Test {

    /**
     * TODO
     * @param args
     * @throws InterruptedException 
     * @Date:2016-7-28
     * @Author dmf
     */
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        MyThread a1 = new MyThread(myService);
        MyThread a2 = new MyThread(myService);
        MyThread a3 = new MyThread(myService);
        MyThread a4 = new MyThread(myService);
        MyThread a5 = new MyThread(myService);
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();

    }

}
