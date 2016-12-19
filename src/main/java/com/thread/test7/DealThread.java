package com.thread.test7;

public class DealThread implements Runnable {
    public String username;
    public Object lock1 = new Object();
    public Object lock2 = new Object();

    public void setUsername(String username) {
        this.username = username;
    }

    public void run() {
        if (username.equals("a")) {
            synchronized (lock1) {
                try {
                    System.out.println("username = " + username);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }//end
                synchronized (lock2) {
                    System.out.println("按 lock1--->lock2--代码顺序执行。");
                }
            }
        }//end 

        if (username.equals("b")) {
            synchronized (lock2) {
                try {
                    System.out.println("username = " + username);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }//end
                synchronized (lock1) {
                    System.out.println("按 lock2--->lock1--代码顺序执行。");
                }
            }
        }//end 
    }
}
