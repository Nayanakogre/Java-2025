package com.xworkz.queueimpl;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImpl {
    public static void main(String[] args) {


        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(4);
        queue.add(4);
        System.out.println(queue);
        //returns head of the queue if it is empty throw NoSuchElementException
        System.out.println(queue.element());
        Queue<Integer> queue1 = new PriorityQueue<>();
        //System.out.println(queue1.element());
        //retrives and removes the head of the queue if it is empty shows null
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue1.poll());
        //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        System.out.println(queue.peek());
        System.out.println(queue.offer(1));
        System.out.println(queue);
        System.out.println(queue.remove(1));
        System.out.println(queue);




    }
}
