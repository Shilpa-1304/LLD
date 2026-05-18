package com.sk.LLD.Lab;

import com.sk.LLD.Lab.CustomException.DuplicateItemException;
import com.sk.LLD.Lab.CustomException.InvalidQuantityException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
//NOTE: Because inventory should only store Item types.
public class Inventory<T extends Items>{
    private HashMap<String ,T> map;

    public void add(T item){
        if(map.containsKey(String.valueOf(item.getId())))
            throw new DuplicateItemException("Dublicate id ");
        if(map.get(String.valueOf(item.getId())).getQuantity()<0)
            throw new InvalidQuantityException("Negative quantity");
        map.put(String.valueOf(item.getId()),item);
    }
    public void remove(T item) {
        map.remove(item.getId());
    }

    public T get(String id) {
        return map.get(id);
    }

    public List<T> getAll() {
        return new ArrayList<>(map.values());
    }
    public List<T> sortByName(){
        List<T> list=getAll();
        list.sort(Comparator.comparing(Items::getName));
        return list;
    }
    public List<T> sortByPriceAscending(){
        List<T> list=getAll();
        list.sort(Comparator.comparing(Items::getPrice));
        return list;
    }
    public List<T> sortByQuantityDescending(){
        List<T> list=getAll();
        list.sort(Comparator.comparing(Items::getPrice).reversed());
        return list;
    }
    public List<T> filterByPriceRange(int min,int max){
        List<T> items=getAll().stream().filter(x->{
            return x.getPrice()>=min && x.getPrice()<max;
        }).collect(Collectors.toList());
        return items;
    }
    public List<T> filterAvailableItems(){
        List<T> items=getAll().stream().filter(x->{
            return x.getQuantity()>0;
        }).collect(Collectors.toList());
        return items;
    }
    public void displayInventory() {

        for (T item : getAll()) {
            System.out.println(item);
        }
    }
}
