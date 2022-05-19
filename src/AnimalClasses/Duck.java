package AnimalClasses;

public class Duck  extends  Animal implements Flying {
    public Duck (String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }
    public void fly() {
        System.out.println("Я утка и я лечу");
    }

    @Override
    public void Say (){
        System.out.println("Кря");
    }

}
