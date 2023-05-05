package dailyClasses.day35_polymorphism.practiceTasks;

public abstract class Phone extends Device {

    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public void call (long number){
        System.out.println("Calling" + number);
    }

    public void text (long number){
        System.out.println("Texting" + number);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
