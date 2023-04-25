package dailyClasses.day28_encapsulation.personTask;

public class PersonTest {

    public static void main(String[] args) {

        Person obj1 = new Person("John",23,'M',"Russian");

        obj1.drink("Water");
        obj1.eat("Bread");

        System.out.println(obj1);
        System.out.println(Person.planet);
        System.out.println(Person.numberOfWings);
        System.out.println(Person.hasNose);
    }

}
