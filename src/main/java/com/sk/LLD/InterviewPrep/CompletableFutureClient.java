package com.sk.LLD.InterviewPrep;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureClient {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        CompletableFuture<Integer> futureResult=CompletableFuture.supplyAsync(() -> {
            System.out.println("CompletableFuture is returning value at Thread: "+ Thread.currentThread().getName());
            return 500;
        }, executorService);

        futureResult.thenAccept(result -> {
            System.out.println("Result: " + result );
        }).join();

        futureResult.join();

        executorService.shutdown();
    }
}