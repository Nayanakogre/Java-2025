//has 16 methods
package com.xworkz.queueimpl;

import java.util.PriorityQueue;

public class PriorityQueueImpl {
    public static void main(String[] args) {


        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        pqueue.add(1);
        pqueue.add(2);
        pqueue.add(3);
        pqueue.add(4);
        pqueue.add(5);
        pqueue.add(6);
        pqueue.add(7);
        pqueue.add(8);
        System.out.println(pqueue.comparator().equals(1));
        


    }
}
