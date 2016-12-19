package com.thread.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrentHashMapTest {
    private AtomicInteger blockedTimes = new AtomicInteger();
    /**
     * TODO
     * @param args
     * @Date:2016-12-2
     * @Author dmf
     */

    public static void main(String[] args) {
        ConcurrentHashMap conMap = new ConcurrentHashMap();
        conMap.put("name", 1);

    }

}
