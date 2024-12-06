package org.example;

public class Dog implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Aboiement !!!!");
    }

    @Override
    public void makeThings(){
        System.out.println("Surveiller !!!");
    }
}
