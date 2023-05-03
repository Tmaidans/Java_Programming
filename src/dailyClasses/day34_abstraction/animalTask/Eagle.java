package dailyClasses.day34_abstraction.animalTask;

public class Eagle extends Animal implements Flyable, Hunting{


    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Eagle " + getName() + "is eating mice");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting");
    }
}
