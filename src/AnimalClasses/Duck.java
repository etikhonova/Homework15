package AnimalClasses;

public class Duck  extends  Animal implements Flying {

    public void fly() {
        System.out.println("Я утка и я лечу");
    }

    @Override
    public void Say (){
        System.out.println("Кря");
    }

}
