package com.sk.LLD.Threads;

import java.util.*;
import java.io.*;
import java.util.concurrent.Semaphore;
public class FooBar {
    private int n;
    Semaphore fooS=new Semaphore(1);
    Semaphore booS=new Semaphore(0);
    public FooBar(int n) {
        this.n = n;
        // Add your synchronization primitives here
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            // Your synchronization logic here
            fooS.acquire();
            printFoo.run();
            booS.release();
            // Your synchronization logic here
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            // Your synchronization logic here
            booS.acquire();
            printBar.run();
            fooS.release();
            // Your synchronization logic here
        }
    }
}

class Main {
    public static String solution(int n) {
        StringBuilder result = new StringBuilder();
        FooBar foobar = new FooBar(n);

        Runnable printFoo = () -> result.append("foo");
        Runnable printBar = () -> result.append("bar");

        Thread t1 = new Thread(() -> {
            try {
                foobar.foo(printFoo);
            } catch (InterruptedException e) {}
        });

        Thread t2 = new Thread(() -> {
            try {
                foobar.bar(printBar);
            } catch (InterruptedException e) {}
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {}

        return result.toString();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}