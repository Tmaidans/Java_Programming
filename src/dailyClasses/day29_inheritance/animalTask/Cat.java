package dailyClasses.day29_inheritance.animalTask;

public class Cat extends Animal {

    //meow, scratch

    public void meow (){
        System.out.println(getName() + " is meowing");
    }

    public void scratch (){
        System.out.println(getName() + " scratching");
    }

}


