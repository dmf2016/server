package com.mylist.test3;
public class Run {
    /**
     * TODO
     * @param args
     * @Date:2016-7-28
     * @Author dmf
     */
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
