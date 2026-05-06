package com.sk.LLD.Threads;

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        Callable<Integer> task=()->{
            Thread.sleep(10000);
            return 10+20;
        };
        System.out.println("Waiting...");
        Future<Integer> result=executorService.submit(task);
        System.out.println(result.get());
        executorService.shutdown();
    }
}
