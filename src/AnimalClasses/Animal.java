package AnimalClasses;

public class Animal {
    private String name;
    private int age;
    private int weight;
    private String color;

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void Say () {
        System.out.println("Я говорю");
    }
    public void Go () {
        System.out.println("Я иду");
    }
    public void Eat () {
        System.out.println("Я пью");
    }
    public void Drink () {
        System.out.println("Я ем");
    }
    public String ageName (int age){
        int lastNumber10 =  (age % 10);
        int LastNumber100 = (age % 100);
        if ( (LastNumber100 >= 11) & (LastNumber100 <= 14 ) ) return " лет";
        else if (lastNumber10 == 0) return " лет";
        else if (lastNumber10 == 1) return " год";
        else if (lastNumber10 == 2) return " года";
        else if (lastNumber10 == 3) return " года";
        else if (lastNumber10 == 4) return " года";
        else return " лет";
    }

    public void Hello () {
        System.out.println("Привет! меня зовут " +name+ ", мне "+ age + ageName(age)+ ", я вешу - "+weight+" кг"+", мой цвет - "+color);
    }

 //   @Override
 //   public void toString (){
 //       System.out.println("Привет! меня зовут " +name+ ", мне "+ age +"лет(/год/года), я вешу - "+weight+" кг"+", мой цвет - "+color);
 //   }
}
