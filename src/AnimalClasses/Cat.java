package AnimalClasses;

public class Cat extends Animal{

    public Cat (String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }
    @Override
    public void Say (){
        System.out.println("Мяу");
    }
}
