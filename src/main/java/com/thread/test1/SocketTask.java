package com.thread.test1;

import java.io.IOException;
import java.net.ServerSocket;

public class SocketTask extends Thread {
    private volatile ServerSocket server;

    public void stopTask() {
        try {
            if (server != null) {
                server.close();
                System.out.println("close task successed");
            }
        } catch (IOException e) {
            System.out.println("close task failded");
        }
    }

    @Override
    public void run() {
        try {
            server = new ServerSocket(3333);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        SocketTask task = new SocketTask();
        task.start();
        Thread.sleep(1000);
        task.stopTask();
    }
}
