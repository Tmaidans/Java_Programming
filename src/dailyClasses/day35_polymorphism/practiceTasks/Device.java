package dailyClasses.day35_polymorphism.practiceTasks;

public abstract class Device {

    private final String brand;
    private final String model;
    private double price;
    private String color;
    private final String size;
    private boolean hasBattery;
    private boolean hasPowerButton;


    public Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {

        if (brand==null||brand.isEmpty()){
            System.err.println("Sorry, brand cannot be null");
            System.exit(1);
        }
        this.brand = brand;
        if (model==null||model.isEmpty()){
            System.err.println("Sorry, model cannot be null");
            System.exit(1);
        }
        this.model = model;
        setPrice(price);
        setColor(color);
        if (size==null||size.isEmpty()){
            System.err.println("Sorry, size cannot be null");
            System.exit(1);
        }
        this.size = size;
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price<=0){
            System.err.println("Sorry, price cannot equal to or be less than 0");
            System.exit(1);
        }
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getSize() {
        return size;
    }
    public boolean isHasBattery() {
        return hasBattery;
    }
    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }
    public boolean isHasPowerButton() {
        return hasPowerButton;
    }
    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
