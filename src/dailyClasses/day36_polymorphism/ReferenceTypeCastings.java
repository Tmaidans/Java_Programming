package dailyClasses.day36_polymorphism;

import dailyClasses.day29_inheritance.animalTask.Animal;
import dailyClasses.day29_inheritance.animalTask.Dog;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        Dog dog = new Dog();

        Animal animal = (Animal) new Dog(); //upcasting new Dog object to Animal reference type //implicit casting

    }

}
