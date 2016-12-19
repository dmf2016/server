package com.mylist.test4;

import java.text.SimpleDateFormat;

public class MyThread extends Thread {
    private SimpleDateFormat sdf;
    private String dateString;

    public MyThread(SimpleDateFormat sdf, String dateStrng) {
        this.sdf = sdf;
        this.dateString = dateString;
    }

    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
