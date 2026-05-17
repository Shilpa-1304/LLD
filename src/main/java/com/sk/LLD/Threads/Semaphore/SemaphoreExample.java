package com.sk.LLD.Threads.Semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample implements Runnable{
    Semaphore semaphore;
    SemaphoreExample(Semaphore semaphore){
        this.semaphore=semaphore;
    }
    @Override
    public void run(){
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " entered");

            Thread.sleep(5000);

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
