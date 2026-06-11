package com.sk.LLD.Threads;

public class TheadExample extends Thread{

    @Override
    public void run() {
        for (int i=0;i<11;i++){
            System.out.println(TheadExample.currentThread().getName()+" gives value: "+(i+1));
        }
    }
}
