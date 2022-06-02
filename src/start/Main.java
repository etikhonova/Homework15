package start;

import AnimalClasses.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Animal> pets = new ArrayList<>();
        boolean isExit = true;
        while (isExit) {
            System.out.println("Use commands:");
            Commands[] commands = Commands.values();
            for (Commands s : commands) { System.out.println(s); }
            System.out.println("Enter command:");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next().trim().toUpperCase(Locale.ROOT);
            switch (choice) {
                case "ADD":
                    System.out.println("Cat, Dog or Duck?");
                    String animalName = sc.next().toLowerCase().trim();
                    if (animalName.equals("cat")) {
                        Animal pet = new Cat();
                        createAnimal(pet, sc);
                        pets.add(pet);
                        pet.Say();
                    } else if (animalName.equals("dog")) {
                        Animal pet = new Dog();
                        createAnimal(pet, sc);
                        pets.add(pet);
                        pet.Say();
                    } else if (animalName.equals("duck")) {
                        Animal pet = new Duck();
                        createAnimal(pet, sc);
                        pets.add(pet);
                        pet.Say();
                    } else System.out.println("Unknown animal");
                    break;
                case "LIST":
                    for (Animal animal : pets) {
                        System.out.println(animal);
                    }
                    break;
                case "EXIT":
                    System.out.println("EXIT");
                    isExit = false;
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }

    };

    public static void createAnimal(Animal newAnimal, Scanner scanner){
        System.out.println("Enter name");
        newAnimal.setName(scanner.next());
        System.out.println("Enter age");
        newAnimal.setAge(scanner.nextInt());
        System.out.println("Enter color");
        newAnimal.setColor(scanner.next());
        System.out.println("Enter weight");
        newAnimal.setWeight(scanner.nextInt());

    }

}
