package com.sk.LLD.InterviewPrep.ProducerConsumerProblem;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueSolution {
    public static void main(String[] args) {
        int capacity=10;
        BlockingQueue<Integer> queue=new LinkedBlockingQueue<>(capacity);

        Thread producerThread=new Thread(()->{
            int value=0;
            while(true){
                try {
                    queue.put(value);
                    System.out.println("Producer produces: " + value);
                    value++;
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consumerThread=new Thread(()->{
            while(true){
                try {
                    int val=queue.take();
                    System.out.println("Consumer consumed value: "+val);
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
