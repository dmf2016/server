package com.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import com.queue.bean.User;

public class TestPriorityQueue {

    public static void main(String args[]) {
        Comparator<User> OrderIsdn = new Comparator<User>() {
            public int compare(User o1, User o2) {
                int numbera = o1.getPopulation();
                int numberb = o2.getPopulation();
                if (numberb > numbera) {
                    return 1;
                } else if (numberb < numbera) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        Queue<User> priorityQueue = new PriorityQueue<User>(11, OrderIsdn);
        User t1 = new User("t1", 1);
        User t3 = new User("t3", 3);
        User t2 = new User("t2", 2);
        User t4 = new User("t4", 0);
        priorityQueue.add(t1);
        priorityQueue.add(t3);
        priorityQueue.add(t2);
        priorityQueue.add(t4);
        System.out.println(priorityQueue.poll().toString());
    }
}
