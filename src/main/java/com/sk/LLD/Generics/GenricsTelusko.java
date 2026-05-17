package com.sk.LLD.Generics;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
class GenericsExample<T extends Number> {
    T value;
    public void show(){
        System.out.println("Value: "+this.value);
    }
    public void showList(ArrayList<? extends Number> list){
        System.out.println(list);
    }
    public <E extends Number> Integer getsquare(E value){
        return value.intValue() * value.intValue();
    }
}
public class GenricsTelusko{
    public static void main(String[] args) {
        GenericsExample<Double> example=new GenericsExample<>();
        example.setValue(2.22);
        example.show();

        example.showList(new ArrayList<Integer>(List.of(22,43,56)));

        //NOTE: ANY SUBCLASS of INTEGER IS ALLOWED AS ?
        List<? extends Integer> list=new ArrayList<Integer>();

        //NOTE: ANY SUBCLASS of NUMBER IS ALLOWED AS ?
        List<? extends Number> list1=new ArrayList<Integer>();

        //NOTE: ANY SUBCLASS of Object IS ALLOWED AS ?
        List<? extends Object> list2=new ArrayList<String>();

        //NOTE: ANY SUPER-CLASS of Integer IS ALLOWED AS ?
        List<? super Integer> list3=new ArrayList<Number>();

        //NOTE: ANY SUPER-CLASS of Object IS ALLOWED AS ?
        List<? super Object> list5=new ArrayList<Object>();
    }
}
