package animal.birds;

import animal.Animal;

public class Duck  extends Animal implements IFlying {

    public void fly() {
        System.out.println("Я утка и я лечу");
    }

    @Override
    public void say (){
        System.out.println("Кря");
    }

}
