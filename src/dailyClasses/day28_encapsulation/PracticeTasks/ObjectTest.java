package dailyClasses.day28_encapsulation.PracticeTasks;

public class ObjectTest {

    public static void main(String[] args) {

        Circle object1 = new Circle(23);
        System.out.println(object1);

        System.out.println("-------------------------------------------------------------");

        Square object2 = new Square(12);
        System.out.println(object2);

        System.out.println("-------------------------------------------------------------");

        Candy candy1 = new Candy("Dickies",22,0,false);
        System.out.println(candy1);

        System.out.println("-------------------------------------------------------------");

        Credentials test1 = new Credentials("Timmy","111111#");
        System.out.println(test1);


    }

}
