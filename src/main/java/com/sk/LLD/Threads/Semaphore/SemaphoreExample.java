package com.sk.LLD.Threads.Semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample extends Thread{
    Semaphore semaphore;
    SemaphoreExample(Semaphore semaphore){
        this.semaphore=semaphore;
    }
    public void run(){
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " entered");

            Thread.sleep(2000);

            System.out.println(Thread.currentThread().getName() + " leaving");
        }
        catch (Exception e){
            System.out.println("Exception: "+e);
        }
        finally {
            semaphore.release();
        }
    }
}
