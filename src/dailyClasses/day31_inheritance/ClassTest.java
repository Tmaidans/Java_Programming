package dailyClasses.day31_inheritance;

public class ClassTest {

    public static void main(String[] args) {

        Car newCar = new Car("Ford","Mistang",2023,"Black",30000);

        newCar.drive();
        System.out.println(newCar);
        System.out.println(newCar.getPrice());
    }
}
