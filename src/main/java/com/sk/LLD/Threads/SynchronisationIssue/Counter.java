package com.sk.LLD.Threads.SynchronisationIssue;

public class Counter {
    int count;
    Counter(int n){
        this.count=n;
    }
    public synchronized void increment(){
        count++;
    }
    public synchronized void decrement(){
        count --;
    }
}
