package org.example;

import java.util.List;

public class Cat implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Miaulement !!!!");
    }

    @Override
    public void makeThings(){
        System.out.println("Fait ses griffes !!");
    }

}
