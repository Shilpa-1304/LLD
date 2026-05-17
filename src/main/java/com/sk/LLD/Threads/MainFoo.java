package com.sk.LLD.Threads;

import java.io.*;
import java.util.concurrent.*;

class Foo {
    Semaphore semF=new Semaphore(1);
    Semaphore semS=new Semaphore(0);
    Semaphore semT=new Semaphore(0);
    public Foo() {
        // Initialize synchronization primitives here

    }

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        semF.acquire();
        printFirst.run();
        semS.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
        semS.acquire();
        printSecond.run();
        semT.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        // printThird.run() outputs "third". Do not change or remove this line.
        semT.acquire();
        printThird.run();
        semF.release();
    }
}

class MainFoo {
    public static String solution(int n) {
        Foo foo = new Foo();
        StringBuilder result = new StringBuilder();

        Runnable printFirst = () -> result.append("first");
        Runnable printSecond = () -> result.append("second");
        Runnable printThird = () -> result.append("third");

        Thread[] threads = {
                new Thread(() -> {
                    try { foo.first(printFirst); } catch (InterruptedException e) {}
                }),
                new Thread(() -> {
                    try { foo.second(printSecond); } catch (InterruptedException e) {}
                }),
                new Thread(() -> {
                    try { foo.third(printThird); } catch (InterruptedException e) {}
                })
        };

        for (Thread t : threads) t.start();
        for (Thread t : threads) {
            try { t.join(); } catch (InterruptedException e) {}
        }

        return result.toString();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        System.out.println(solution(n));
    }
}