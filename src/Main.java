import animal.*;
import data.AnimalType;
import data.Commands;
import animal.pets.Cat;
import animal.pets.Dog;
import animal.birds.Duck;
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
    }
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
                    return Integer.parseInt(addString.trim());
                }
                catch (NumberFormatException nfe)
                {
                    System.out.println("NumberFormatException: " + nfe.getMessage()+ " Enter again");
                    addInt();
                }
        return 1;
    }
    public static Animal addAnimal (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cat, Dog or Duck?");
        String animalName = sc.next().trim().toUpperCase();
        try {
            switch (AnimalType.valueOf(animalName)) {
                case CAT -> {
                    Animal petCat = new Cat();
                    createAnimal(petCat, sc);
                    petCat.say();
                    return petCat;
                }
                case DOG -> {
                    Animal petDog = new Dog();
                    createAnimal(petDog, sc);
                    petDog.say();
                    return petDog;
                }
                case DUCK -> {
                    Animal petDuck = new Duck();
                    createAnimal(petDuck, sc);
                    petDuck.say();
                    return petDuck;
                }
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Unknown animal");
            addAnimal();
        }
        return null;
    }

}
