package com.sk.LLD.Threads;

public class SimpleThreadsUsingRunnable implements  Runnable{

    int num;
    public SimpleThreadsUsingRunnable(int n){
        this.num=n;
    }
    @Override
    public void run() {
        for(int i=0;i<this.num;i++){
            System.out.println("Thread: "+Thread.currentThread().getName()+" with Number: "+i+ " At priority: "+Thread.currentThread().getPriority() + " @ "+Thread.currentThread().getState());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
