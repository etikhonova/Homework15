package animal;

public abstract class Animal {

    protected String name;
    protected int age;
    protected int weight;
    protected String color;

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

    public void say () {
        System.out.println("Я говорю");
    }
    public void Go () {
        System.out.println("Я иду");
    }
    public void Eat () {
        System.out.println("Я ем");
    }
    public void Drink () {
        System.out.println("Я пью");
    }

    public String ageName (int age){
        int lastNumber10 =  (age % 10);
        int lastNumber100 = (age % 100);
        if ( (lastNumber100 >= 11) & (lastNumber100 <= 14 ) ) return " лет";
        else if (lastNumber10 == 0) return " лет";
        else if (lastNumber10 == 1) return " год";
        else if (lastNumber10 == 2) return " года";
        else if (lastNumber10 == 3) return " года";
        else if (lastNumber10 == 4) return " года";
        else return " лет";
    }

    @Override
    public String toString() {
        return "Привет! меня зовут " +name+ ", мне "+ age + ageName(age)+ ", я вешу - "+weight+" кг"+", мой цвет - "+color;
    }
}
