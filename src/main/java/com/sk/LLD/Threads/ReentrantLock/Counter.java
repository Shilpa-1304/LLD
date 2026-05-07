package com.sk.LLD.Threads.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    int count;
    ReentrantLock lock=new ReentrantLock();
    Counter(int n){
        this.count=n;
    }

    //NOTE: ReentrantLock
    public void increment(){
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }
    public void decrement(){
        lock.lock();
        try {
            count--;
        } finally {
            lock.unlock();
        }
    }
}
