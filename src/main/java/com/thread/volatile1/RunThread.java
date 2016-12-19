package com.thread.volatile1;

public class RunThread extends Thread {
    volatile private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    public void run() {
        System.out.println("---run---");
        while (isRunning == true) {

        }
        System.out.println("---线程被停止了---");
    }

}
