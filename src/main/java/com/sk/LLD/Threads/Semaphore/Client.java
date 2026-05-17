package com.sk.LLD.Threads.Semaphore;

import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Semaphore semaphore=new Semaphore(2);
        for(int i=0;i<5;i++){
            SemaphoreExample semaphore1=new SemaphoreExample(semaphore);
            Thread t=new Thread(semaphore1);
            t.start();
        }
    }
}
