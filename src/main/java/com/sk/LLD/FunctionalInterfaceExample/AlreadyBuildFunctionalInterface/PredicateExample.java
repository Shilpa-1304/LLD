package com.sk.LLD.FunctionalInterfaceExample.AlreadyBuildFunctionalInterface;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        Predicate<Integer> isEven=(number)->number%2==0;
        Predicate<Integer> isGreaterThan100=(num)->num>100;

        //NOTE: Prediate.and
        Predicate<Integer> checkAnd= isEven.and(isGreaterThan100);
        System.out.println("is number even and greater than 100: "+checkAnd.test(358));

        //NOTE: Prediate.or
        Predicate<Integer> checkOr= isEven.or(isGreaterThan100);
        System.out.println("is number even OR greater than 100: "+checkOr.test(157));

        //NOTE: Prediate.negate
        Predicate<Integer> checkNegate= isEven.negate();
        System.out.println("is number even (Negate it): "+checkOr.test(157));

        //NOTE: Real life Example:
        List<String> names = List.of("Alice", "Bob", "Anna", "Charlie");
        Predicate<String> longName=(name)->name.length()>6;

        names.stream().filter(x->longName.test(x)).forEach(System.out::println);
        //NOTE: Method Reference = Shorter form of Lambda
    }
}
