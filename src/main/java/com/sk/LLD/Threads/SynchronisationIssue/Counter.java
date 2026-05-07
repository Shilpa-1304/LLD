package com.sk.LLD.Threads.SynchronisationIssue;

public class Counter {
    int count;
    Counter(int n){
        this.count=n;
    }

    //NOTE: Race Condition

    /* public void increment(){
        count++;
    }
    public void decrement(){
        count --;
    }*/

    //NOTE: Solution1:  Method level synchronization

    /* public synchronized void increment(){
        count++;
    }
    public synchronized void decrement(){
        count --;
    }*/

    //NOTE: Solution 2: Block Level Synchronization
    public void increment(){
        synchronized (this){
            count++;
        }
    }
    public void decrement(){
        synchronized (this){
            count--;
        }
    }
}
