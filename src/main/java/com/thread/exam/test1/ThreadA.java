package com.thread.exam.test1;

public class ThreadA implements Runnable {
   private int num;
    @Override
    public void run() {

         for(int i=0; i<num; i++){
             System.out.println("i:"+i);
         }
    }

}
