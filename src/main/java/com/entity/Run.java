package com.entity;

public class Run {

    /**
     * TODO
     * @param args
     * @Date:2016-7-28
     * @Author dmf
     */

    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        ThreadP threadP = new ThreadP(p);
        ThreadC threadC = new ThreadC(c);
        threadP.start();
        threadC.start();

    }

}
