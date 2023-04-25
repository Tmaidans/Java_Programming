package dailyClasses.day26_statics;

public class TestCarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota");

        System.out.println("car1 = " + car1);

        Car car2 = new Car ("BMW","3 Series");

        System.out.println("car2 = " + car2);

        Car car3 = new Car ("Honda","Civik",2022);

        System.out.println("car3 = " + car3);

        Car car4 = new Car ("Toyota","Rav 4", 1998,20000);

        System.out.println("car4 = " + car4);

        Car car5 = new Car ("Lexus","ES350","Blue",30000,30000);

        System.out.println("car5 = " + car5);
    }

}
