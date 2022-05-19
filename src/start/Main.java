package start;

import AnimalClasses.Animal;
import AnimalClasses.Cat;
import AnimalClasses.Dog;
import AnimalClasses.Duck;

public class Main {
    public static void main(String[] args) {
        Animal [] animals = new Animal[]{
                new Dog("Name", 2115, 10, "Color"),
                new Cat("catname", 13, 12, "black"),
                new Duck("duckname", 14, 33, "red"),
        };
        for (Animal animal : animals) {
            animal.Hello();
            if (animal instanceof Cat) {
                ((Cat)animal).Say();
            } else if (animal instanceof Dog) {
                ((Dog)animal).Say();
            } else if (animal instanceof Duck){
                ((Duck)animal).fly();
            }
        }






    };

}
