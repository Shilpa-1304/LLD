package com.sk.LLD.GeneralLearnings;
class LargeAnimal{
    String name;
    public void makeSound(){
        System.out.println("Gup-Gup");
    }
}
class Animal extends LargeAnimal{
    @Override
    public void makeSound(){
        System.out.println("Hup-Hup");
    }
}
class SmallAnimal extends Animal{
    public void getName(){
        System.out.println("I am small animal");
    }
    @Override
    public void makeSound(){
        System.out.println("Dhup-Dhup");
    }
}
public class InheritenceExpample {
    public static void main(String[] args) {
        LargeAnimal sa=new SmallAnimal();

        /* sa.getName();  Becausee refernce-type: LargeAnimal check at compile
            time that if it contains getName(); or not
        */
        sa.makeSound();
    }
}
