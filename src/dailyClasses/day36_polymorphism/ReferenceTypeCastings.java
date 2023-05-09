package dailyClasses.day36_polymorphism;

import dailyClasses.day29_inheritance.animalTask.Animal;
import dailyClasses.day29_inheritance.animalTask.Cat;
import dailyClasses.day29_inheritance.animalTask.Dog;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        Dog dog = new Dog();

        Animal animal = (Animal) new Dog(); //upcasting new Dog object to Animal reference type //implicit casting

        System.out.println("--------------------------------------------------------------------------------------");

             Animal animal1 = new Dog(); //upcasting ==> Polymorphism
        // reference type  ---- object type

        animal1.setInfo("Max","Husky",'M',4,"Large","White");

        animal1.eat();
        animal1.drink();
        animal1.sleep();
        ((Dog)animal1).bark(); //down casting. Only doable one time

      //  Dog dog1 = (Dog) animal1; //Down casting explicitly. Makes it reusable
      //  dog1.bark();

     //   ((Cat)animal1).scratch(); //class cast exception - no "is a" relationship. Dog object cannot be cast to Cat

        System.out.println("--------------------------------------------------------------------------------------");



    }

}
