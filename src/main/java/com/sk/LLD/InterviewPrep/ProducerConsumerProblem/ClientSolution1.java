package com.sk.LLD.InterviewPrep.ProducerConsumerProblem;

public class ClientSolution1 {
    public static void main(String[] args) {
        SharedBuffer sb=new SharedBuffer();

        Thread producerTherad=new Thread(()->{
            int value=0;
            while(true){
                try {
                    sb.produce(value++);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consumerTherad=new Thread(()->{
            while(true){
                try {
                    sb.consume();
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        producerTherad.start();
        consumerTherad.start();
    }
}
