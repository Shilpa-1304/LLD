package com.sk.LLD.Lab;

import lombok.Data;

import java.util.Objects;

@Data
public class Items implements Comparable<Items>{

    private int id;
    private String name;
    private int price;
    private int quantity;
    @Override
    public int compareTo(Items o) {
        return Integer.compare(this.price, o.price);
    }
    /*
    *   Why override equals/hashCode?
        Needed for:

        HashMap
        HashSet
        LinkedList.remove(item)

        Without overriding:

        duplicate detection fails
        recently viewed remove fails
    * */

    @Override
    public boolean equals(Object o){
        if(this.equals(o)) return true;
        if(! (o instanceof Items)) return false;

        return Objects.equals(o,this);
    }
    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
    @Override
    public String toString(){
        return id + " " + name + " " + price;
    }
}
