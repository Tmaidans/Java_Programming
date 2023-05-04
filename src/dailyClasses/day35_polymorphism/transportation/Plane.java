package dailyClasses.day35_polymorphism.transportation;

import dailyClasses.day34_abstraction.animalTask.Flyable;

public class Plane extends  Transportation implements Flyable {

    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void transportPeople() {
        System.out.println(getMake()+ " is transporting people");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " has started");
    }

    @Override
    public void fly() {
        System.out.println(getMake() + " is flying");
    }
}
