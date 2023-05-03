package dailyClasses.day34_abstraction.animalTask;

public class Dolphin extends Animal implements Playable{


    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin " + getName() + " is eating smaller fish");
    }

    @Override
    public void play() {
        System.out.println("Dolphin " + getName() + " is playing");
    }
}
