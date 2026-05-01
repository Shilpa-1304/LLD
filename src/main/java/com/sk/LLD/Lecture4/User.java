package com.sk.LLD.Lecture4;

public class User {
    String name;
    int id;
    public User(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void display(){
        System.out.println("Name: "+this.name);
    }
}
