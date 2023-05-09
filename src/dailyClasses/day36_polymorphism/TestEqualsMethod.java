package dailyClasses.day36_polymorphism;

public class TestEqualsMethod {

    public static void main(String[] args) {

        Circle cir1 = new Circle(5);
        Circle cir2 = new Circle(5);
        Circle cir3 = new Circle(3);

        System.out.println(cir1.equals(cir2));
        System.out.println(cir1.equals(cir3));

    }

}
