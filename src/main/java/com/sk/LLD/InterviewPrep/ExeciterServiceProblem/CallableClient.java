package com.sk.LLD.InterviewPrep.ExeciterServiceProblem;

import java.util.concurrent.*;

public class CallableClient {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        //newCachedThreadPool : Creates thread dynamically
        //Executors.newSingleThreadExecutor() :  Only one worker thread
        //Executors.newScheduledThreadPool() : For delayed/scheduled tasks
            /*
        * REAL BACKEND USE CASES
            Used in:
            API request handling
            async processing
            email sending
            batch jobs
            Kafka consumers
            payment processing
            logging systems
        *
        * */

        Callable callable=()->{
            System.out.println("Callable is returning value at Thread: "+Thread.currentThread().getName());
            return 500;
        };

        Future<Integer> ans=executorService.submit(callable);
        System.out.println("Result: "+ans.get());
        executorService.shutdown();
    }
}
