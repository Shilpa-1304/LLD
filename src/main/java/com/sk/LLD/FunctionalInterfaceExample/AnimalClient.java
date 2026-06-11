package com.sk.LLD.FunctionalInterfaceExample;

public class AnimalClient {
    public static void main(String[] args) {

        //NOTE: Way 1: Create a separate class that implements functional interface.
       new Animal().makeSound();

       //NOTE: Way 2: USE Lambda Expression
       AnimalFunctionalInt animal=()->{
           System.out.println("Meow-Meow");
       };
    }
}
class Animal implements AnimalFunctionalInt{

    @Override
    public void makeSound() {
        System.out.println("Bow-Bow");
    }
}
