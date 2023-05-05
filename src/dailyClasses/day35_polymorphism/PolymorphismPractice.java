package dailyClasses.day35_polymorphism;

import dailyClasses.day34_abstraction.animalTask.*;
import dailyClasses.day35_polymorphism.transportation.*;

public class PolymorphismPractice {

    public static void main(String[] args) {

        Animal tiger = new Tiger("Sher Khan","Bingal",'M',5,"Large","Orange");

        tiger.eat();
        tiger.drink();
     //   tiger.hunt();
        tiger.sleep();

        System.out.println("---------------------------");

        Animal animal = new Eagle("John","American Eagle",'M',3,"Small","Black and white");
        //animal.fly();
        animal.eat();
        animal.sleep();
        animal.drink();

        System.out.println("------------------------------------------------------");

        Flyable obj1 = new Eagle("John","American Eagle",'M',3,"Small","Black and white");
        obj1.fly();
        System.out.println(obj1.canFly);

        Lion lion = null;

        Parrot parrot = null;

        Shark shark = null;

        Dolphin dolphin = null;

        Eagle eagle = null;

        Dog dog = null;

        Cat cat = null;

        CydeoCar cydeoCar = null;

        Flyable[] birds = {parrot,eagle,obj1};

        Hunting[] predators = {shark,lion,eagle,cat};

        Playable[] friendly = {dog,cat,dolphin,parrot};

        boolean isAnimal = obj1 instanceof Animal;

        System.out.println(isAnimal);

        System.out.println("-------------------------------------------------------------------");

        Car car = new Tesla("Tesla","Model Y","White",2020,55000);

        boolean isTesla = car instanceof Tesla;
        boolean isAudi = car instanceof Audi;

        boolean isElectric = car instanceof Electric;
        boolean hasAutoPark = car instanceof AutoPark;
        boolean hasAutoPilot = car instanceof AutoPilot;

        System.out.println("isTesla = " + isTesla);
        System.out.println("isAudi = " + isAudi);
        System.out.println("isElectric = " + isElectric);
        System.out.println("hasAutoPark = " + hasAutoPark);
        System.out.println("hasAutoPilot = " + hasAutoPilot);


    }
}
