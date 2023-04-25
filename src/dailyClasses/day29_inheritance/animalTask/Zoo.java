package dailyClasses.day29_inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Sharik", "husky", 'M', 6, "large", "black");

        Cat cat = new Cat();
        cat.setInfo("Dingus", "homeless", 'F', 3, "small", "white");

        Tiger tiger = new Tiger();
        tiger.setInfo("Killer", "siberian", 'M', 12, "Huge", "striped");


        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("-----------------------------------------------------------------------");

        dog.eat();
        cat.eat();
        tiger.eat();



    }
}


