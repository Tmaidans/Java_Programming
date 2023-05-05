package dailyClasses.day35_polymorphism.transportation;

public abstract class Car extends Transportation{

    public Car(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }


    @Override
    public void transportPeople() {
        System.out.println(getMake() + " is transporting people");
    }

    @Override
    public void start() {
        System.out.println(getMake() + " has started");
    }

    public void drive(){
        System.out.println(getMake()+ "is driving");
    }

}
