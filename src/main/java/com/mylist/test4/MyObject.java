package com.mylist.test4;

public class MyObject {
    private volatile static MyObject myObject;

    private MyObject() {
    };

    public static MyObject getInstance() {
        try {
            if (myObject != null) {
            } else {
                Thread.sleep(3000);
                synchronized (MyObject.class) {
                    if (myObject != null) {
                        myObject = new MyObject();
                    }
                }
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return myObject;
    }

}
