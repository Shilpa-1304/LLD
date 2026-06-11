package com.sk.LLD.Threads;

import lombok.Data;

@Data
public class RunnableExample implements Runnable{
    int num=0;
    public RunnableExample(int n){
        this.num=n;
    }

    @Override
    public void run() {
        System.out.println("Runnable example: ");
        for (int i=0;i<num;i++){
            System.out.println(TheadExample.currentThread().getName()+" gives value: "+(i+1));
        }
    }
}
