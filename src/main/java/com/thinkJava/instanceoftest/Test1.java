package com.thinkJava.instanceoftest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {

    /**
     * TODO
     * @param args
     * @Date:2016-12-2
     * @Author dmf
     */

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        List list = new ArrayList();
        list.add(dog);
        list.add(cat);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Animal) it.next()).animalDo();
        }

    }

}
