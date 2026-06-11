package com.sk.LLD.Threads;
 class Volatile{
     private volatile boolean flag=true;
     public void changeFlag(){
         this.flag=false;
         System.out.println("Flag is false now.");
     }
     public void run(){
         while(flag){
//             System.out.println("Flag is true"); <- internal synchronization in PrintStream
         }
         System.out.println("Flag is outside run");
     }
}
public class VolatileExample {

    public static void main(String[] args) throws InterruptedException {

        Volatile v=new Volatile();

        Runnable task1=()->{
            v.run();
        };
        Runnable task2=()->{
            v.changeFlag();
        };

        Thread t1=new Thread(task1);
        Thread t2=new Thread(task2);

        t1.start();
        t1.join(10);
        t2.start();

    }
}
