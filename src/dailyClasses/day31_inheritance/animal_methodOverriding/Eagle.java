package dailyClasses.day31_inheritance.animal_methodOverriding;

public class Eagle extends Animal {

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Eagle "+ getName() + " is eating Eagle food");
    }

    @Override
    public void sleep() {
        System.out.println("Eagle " + getName() + "sleeps 5 hours in a day");
    }



}
