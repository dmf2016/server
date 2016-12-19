package com.thinkJava.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class TestMap {

    /**
     * TODO
     * @param args
     * @Date:2016-12-16
     * @Author dmf
     */

    public static void main(String[] args) {
       /* Map<String, String> map = new HashMap<String, String>();
        map.put("userId", "dmf");
        map.put("username", "邓明锋");
        for (Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }*/
        ConcurrentHashMap<String, String> curMap = new ConcurrentHashMap<String, String>();
        curMap.put("userId", "dmf");
        curMap.put("username", "邓明锋");
        for (Entry<String, String> entry : curMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
