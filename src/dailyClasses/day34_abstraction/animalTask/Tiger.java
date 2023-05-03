package dailyClasses.day34_abstraction.animalTask;

public class Tiger extends Animal implements Hunting{


    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Tiger " + getName() + " is eating a rodent");
    }


    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting");
    }
}
