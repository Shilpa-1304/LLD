package com.sk.LLD.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        for(int i=0;i<10;i++){
            int taskId = i+1;
            executorService.execute(()->{
                System.out.println("Task " + taskId + " by " + Thread.currentThread().getName());
            });
            executorService.shutdown();
        }
    }
}
