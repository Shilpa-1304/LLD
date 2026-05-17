package com.sk.LLD.Lab;

public class Items implements Comparable<Items>{

    private int id;
    private String name;
    private int price;
    private int quantity;
    @Override
    public int compareTo(Items o) {
        return Integer.compare(this.price, o.price);
    }
}
