package dailyClasses.day35_polymorphism;

import dailyClasses.day34_abstraction.animalTask.*;
import dailyClasses.day35_polymorphism.transportation.Car;
import dailyClasses.day35_polymorphism.transportation.Tesla;

public class PolymorphismIntro {

    public static void main(String[] args) {

       Dog dog =  new Dog("Max", "husky", 'M', 4, "Small", "White");

       Cat cat =  new Cat("Max", "husky", 'M', 4, "Small", "White");

       Tiger tiger = null;

       Eagle eagle = null;

       Lion lion = null;

       Parrot parrot = null;

       Animal[] animals = {dog,cat,tiger,eagle,lion,parrot};

        System.out.println("====================================================");

        String str = "JAva";

        Integer n = 100;

        Boolean r =false;

        Double d = 10.4;

        Object[] objects = {str,n,r,d};

        System.out.println("-------------------------------------------------");









    }
}
