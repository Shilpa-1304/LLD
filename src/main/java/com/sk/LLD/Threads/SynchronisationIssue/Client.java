package com.sk.LLD.Threads.SynchronisationIssue;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Project started @ "+Thread.currentThread().getName());

        Counter counter=new Counter(555);
        Runnable runnableIncrementTask=()->{
            for(int i=0;i<10000;i++){
                counter.increment();
            }
        };
        Runnable runnableDecrementTask=()->{
            for(int i=0;i<10000;i++){
                counter.decrement();
            }
        };
        Thread t1=new Thread(runnableIncrementTask);
        Thread t2=new Thread(runnableDecrementTask);

        t1.start();
        t2.start();
        System.out.println("Before t1 completes, Value of Count: "+ counter.count);
        t1.join();
        System.out.println("Before t2 completes,Value of Count: "+ counter.count);
        t2.join();
        System.out.println("Final Value of Count: "+ counter.count);
    }
}
