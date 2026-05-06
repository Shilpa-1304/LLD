package com.sk.LLD.Threads.SynchronisationIssue;

public class Counter {
    int count;
    Counter(int n){
        this.count=n;
    }
    void increment(){
        count++;
    }
    void decrement(){
        count --;
    }
}
