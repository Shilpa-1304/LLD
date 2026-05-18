package com.sk.LLD.Lab;

import java.util.PriorityQueue;

public class OrderProcessor {
    PriorityQueue<Order> pq=new PriorityQueue<>();
    public  void addOrder(Order o){
        pq.offer(o);
    }
    public Order poll(){
        return pq.poll();
    }
}
