package com.sk.LLD.InterviewPrep.ProducerConsumerProblem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SharedBuffer {
    private int capacity=10;
    List<Integer> list=new ArrayList<>();
    private Queue<Integer> queue=new LinkedList<>();

    public synchronized void produce(int value) throws InterruptedException {

        while(capacity == queue.size()){
            wait();
        }
        queue.add(value);
        System.out.println("Value added in queue: "+value);
        notify();
    }
    public synchronized void consume() throws InterruptedException {
        while(queue.isEmpty()){
            wait();
        }
        int value=queue.poll();
        System.out.println("Value consumed from the queue: "+value);
        notify();
    }

}
