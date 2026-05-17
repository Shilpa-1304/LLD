package com.sk.LLD.Generics;

public class Box<S> {
    S value;
    public S getS() {
        return value;
    }
    public void putS(S val){
        this.value=val;
    }

    public static <S> void printArr(S[] arr){
        for(S num:arr){
            System.out.println("Num: "+ num);
        }
    }

    public static <S extends Integer> void printIntegerArr(S[] arr){
        for(S num:arr){
            System.out.println("Num: "+ num);
        }
    }

}
