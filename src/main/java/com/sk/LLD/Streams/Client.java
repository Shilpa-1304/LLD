package com.sk.LLD.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        List<Item> itemsList1 = new ArrayList<>();
        itemsList1.add(new Electronics("E1", "Laptop", 75000.0, 10, 24));
        itemsList1.add(new Electronics("E2", "Mobile Phone", 25000.0, 0, 12));
        itemsList1.add(new Book("B1", "Clean Code", 599.0, 15, "Robert Martin"));
        itemsList1.add(new Book("B2", "Effective Java", 499.0, 8, "Joshua Bloch"));
        itemsList1.add(new Clothing("C1", "T-Shirt", 999.0, 50, "L"));
        itemsList1.add(new Clothing("C2", "Jeans", 2499.0, 20, "M"));
        itemsList1.add(new Electronics("E3", "Earphones", 1999.0, 30, 6));
        //NOTE: task 1.1
        itemsList1.stream()
                .map(x->x.getId())
                .forEach(x->System.out.print(x + " , "));
        //NOTE: task 1.2
        //Create a list of item names in lowercase and print it

        List<String> list =itemsList1.stream().map(x->x.getName().toLowerCase()).collect(Collectors.toList());

        //NOTE: Task 1.3-> Generate a list of the lengths of item names
        List<Integer> list2=itemsList1.stream().map(x->x.getName().length()).collect(Collectors.toList());

        //NOTE: Task 2.1 ->  Find all items priced above ₹1000 and print their names
        itemsList1.stream().filter(x->x.getPrice()>1000).forEach(x-> System.out.println(x));

        //NOTE: Task 2.2 ->   Check if any item has a quantity of 0 using anyMatch
        boolean ans=itemsList1.stream().anyMatch(x->x.getQuantity() == 0);

        //NOTE: Task 2.3 -> Verify that all items have a price greater than 0 using allMatch
        boolean ans1=itemsList1.stream().allMatch(x->x.getQuantity() > 0);

        //NOTE: Task 2.4 -> Confirm that no item has a negative quantity using noneMatch
        boolean result=itemsList1.stream().noneMatch(x->x.getQuantity() < 0);
    }
}
