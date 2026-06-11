package com.sk.LLD.FunctionalInterfaceExample.AlreadyBuildFunctionalInterface;

import java.util.function.*;

public class PizzaShop {
    public static void main(String[] args) {

        //NOTE: This worker checks something and returns boolean value using test method
        Predicate<Integer> isPizzaLarge=(size)->{
            return size>12;
        };
        System.out.println("Is Pizza large: "+ isPizzaLarge.test(14));

        Predicate<Integer> isPizzaExtraLarge = size-> size>16;
        System.out.println("Is Pizza Extra large: "+ isPizzaExtraLarge.test(14));

        //NOTE: Function = converting worker using apply method (Takes input and return result)
        Function<Integer,Integer> getPrice=(size)-> size*1000;
        System.out.println("Total Pizza price: "+ getPrice.apply(12));

        //NOTE: Consumer = action worker using accept method
        Consumer<Integer> showPrice=(amt)-> System.out.println("Cheese Pizza of Rs. "+ amt);
        showPrice.accept(230);

        //NOTE: Supplier = producer worker using get method (It doesn't take input, just return)
        Supplier<String> makePizza =() -> "Fresh Farmhouse Pizza";
        System.out.println(makePizza.get());

        //NOTE: BiFunction = two-input worker using apply method
        BiFunction<Integer, Integer, Integer> totalBill =
                (pizzaPrice, drinksPrice) -> pizzaPrice + drinksPrice;

        System.out.println("Total amount "+totalBill.apply(500, 100));
    }
}
