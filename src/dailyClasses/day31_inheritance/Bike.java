package dailyClasses.day31_inheritance;

public class Bike extends Vehicle{

    public Bike(String brand, String model, int year, String color, double price) {
        super(brand, model, year, color, price);
    }

    public void ride(){
        System.out.println("Riding my "+ getBrand() + " " + getModel());
    }


}
