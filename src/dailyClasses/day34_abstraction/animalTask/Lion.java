package dailyClasses.day34_abstraction.animalTask;

public class Lion extends Animal implements Hunting {


    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Lion " + getName() + " is eating deer");
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting");
    }
}
