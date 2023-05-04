package dailyClasses.day35_polymorphism.transportation;

public abstract class Transportation {

    final String make;
    final String model;
    private String color;
    final int year;
    private double price;


    public Transportation(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        setColor(color);
        this.year = year;
        setPrice(price);
    }

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    public abstract void transportPeople ();
    public abstract void start();

    public void stop(){
        System.out.println("Shut off the engine");
    }

    @Override
    public String toString() {
        return "Transportation{" +
                "make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", year=" + getYear() +
                ", price=" + getPrice() +
                '}';
    }
}
