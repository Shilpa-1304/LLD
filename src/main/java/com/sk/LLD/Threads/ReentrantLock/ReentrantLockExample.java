package com.sk.LLD.Threads.ReentrantLock;

public class ReentrantLockExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter(555);
        Runnable incrementTask=()->{
            for(int i=0;i<1000;i++){
                counter.increment();
            }
        };
        Runnable decrementTask=()->{
            for(int i=0;i<1000;i++){
                counter.decrement();
            }
        };
        Thread t1=new Thread(incrementTask);
        Thread t2=new Thread(decrementTask);

        t1.start();t2.start();
        t1.join();t2.join();
    }
}
