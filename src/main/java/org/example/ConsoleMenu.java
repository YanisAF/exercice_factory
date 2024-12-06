package org.example;

import java.util.List;
import java.util.Scanner;

public class ConsoleMenu {

    private AnimalFactory animalFactory;
    private Animal animal;
    private final Scanner scanner = new Scanner(System.in);


    public void start(){
        while(true){
            System.out.println("=== Menu ===");
            System.out.println("1. Créer un Animal");
            System.out.println("2. Lister les Animaux que l'on peut créer");
            System.out.println("3. Quitter");
            System.out.println("Choix : ");


            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1 -> {
                    System.out.println("1. Créer un chat");
                    System.out.println("2. Créer un chien");
                    int choice2 = Integer.parseInt(scanner.nextLine());
                    switch (choice2){
                        case 1 -> {
                            animalFactory = new CatFactory();
                            Animal cat = animalFactory.createAnimal();
                            cat.makeSound();
                            return;
                        }
                        case 2 -> {
                            animalFactory = new DogFactory();
                            Animal dog = animalFactory.createAnimal();
                            dog.makeSound();
                            return;
                        }
                    }
                }
                case 2 -> {
                    System.out.println("=== Liste d'animaux possible à créer ===");
                    System.out.println("1. Chat");
                    System.out.println("2. Chien");
                }
                case 3 -> {
                    System.out.println("Au revoir !");
                    return;
                }
                default -> System.out.println("Choix invalide. Réessayez.");
            }
        }
    }
}
