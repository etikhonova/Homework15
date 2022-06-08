import animal.*;
import animal.birds.Duck;
import animal.pets.Cat;
import animal.pets.Dog;
import data.Commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Animal> pets = new ArrayList<>();
        boolean isExit = true;
        while (isExit) {
            System.out.println("Use commands:");
            Commands[] commands = Commands.values();
            for (Commands s : commands) { System.out.println(s); }
            System.out.println("Enter commands:");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next().trim().toUpperCase();
            try {
                switch (Commands.valueOf(choice)) {
                    case ADD:
                        pets.add(addAnimal());
                        break;
                    case LIST:
                        for (Animal animal : pets) {
                            System.out.println(animal);
                        }
                        break;
                    case EXIT:
                        System.out.println("EXIT");
                        isExit = false;
                        break;
                }
            }
            catch (IllegalArgumentException e){
                System.out.println("Unknown command");
            }
        }

    };
    public static void createAnimal(Animal newAnimal, Scanner scanner){
        System.out.println("Enter name");
        newAnimal.setName(scanner.next());
        System.out.println("Enter age");
        newAnimal.setAge(addInt());
        System.out.println("Enter color");
        newAnimal.setColor(scanner.next());
        System.out.println("Enter weight");
        newAnimal.setWeight(addInt());
    }
    public static Integer addInt () {
        Scanner sc = new Scanner(System.in);
        String addString = sc.next();
                try {
                int newInt = Integer.parseInt(addString.trim());
                    return newInt;
                }
                catch (NumberFormatException nfe)
                {
                    System.out.println("NumberFormatException: " + nfe.getMessage()+ "Enter again");
                    addInt();
                }
        return 1;
    }
    public static Animal addAnimal (){
        Scanner sc = new Scanner(System.in);
        Animal petabs = new Animal();
        System.out.println("Cat, Dog or Duck?");
        String animalName = sc.next().toLowerCase().trim();
        if (animalName.equals("cat")) {
            Animal pet = new Cat();
            createAnimal(pet, sc);
            pet.say();
            return pet;
        } else if (animalName.equals("dog")) {
            Animal pet = new Dog();
            createAnimal(pet, sc);
            pet.say();
            return pet;
        } else if (animalName.equals("duck")) {
            Animal pet = new Duck();
            createAnimal(pet, sc);
            pet.say();
            return pet;
        } else {
            System.out.println("Unknown animal");
            addAnimal();
        };
        return petabs;
    }

}
