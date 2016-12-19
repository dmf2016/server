package com.thinkJava.instanceoftest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {

    /**
     * TODO
     * @param args
     * @Date:2016-12-2
     * @Author dmf
     */

    public static void main(String[] args) {
        Station s = new Station();
        Cell c = new Cell();

        List<Object> list = new ArrayList<Object>();
        list.add(s);
        list.add(c);

        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            if (obj instanceof Station) {
                Station s1 = (Station) obj;
                s1.stationDo();
            }
            if (obj instanceof Cell) {
                Cell c1 = (Cell) obj;
                c1.cellDo();
            }
        }

    }

}
