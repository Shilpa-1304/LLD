package com.sk.LLD.Threads;

public class Client {
    public static void main(String[] args) {
        TheadExample t=new TheadExample();
//        t.start();


        RunnableExample runnableExample=new RunnableExample(11);
        Thread t1=new Thread(runnableExample);
        t1.start();

        RunnableExample runnableExample2=new RunnableExample(21);
        Thread newT=new Thread(runnableExample2);
        newT.start();

    }
}
