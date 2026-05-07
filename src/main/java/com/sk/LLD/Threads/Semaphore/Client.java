package com.sk.LLD.Threads.Semaphore;

import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Semaphore semaphore=new Semaphore(2);
        for(int i=0;i<5;i++){
            new SemaphoreExample(semaphore).start();
        }
    }
}
