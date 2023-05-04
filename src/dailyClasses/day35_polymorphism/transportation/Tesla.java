package dailyClasses.day35_polymorphism.transportation;

public class Tesla extends Car implements AutoPark, AutoPilot, Electric {

    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void autoPilot() {
        System.out.println(getMake() + " engaged autopilot");
    }

    @Override
    public void autoPark() {
        System.out.println(getMake() + " is auto parked");
    }

    @Override
    public void charge() {
        System.out.println(getMake() + " is charging");
    }
}
