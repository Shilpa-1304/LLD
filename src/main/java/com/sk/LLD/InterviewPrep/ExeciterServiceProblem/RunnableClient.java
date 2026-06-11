package com.sk.LLD.InterviewPrep.ExeciterServiceProblem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableClient {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3);

        Runnable runnable=()->{
            System.out.println("Runnable task is running at thread: "+Thread.currentThread().getName());
        };
        for(int i=0;i<5;i++)
            executorService.execute(runnable);
        executorService.shutdown();

    }
}
