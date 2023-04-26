package officeHours.officeHoursWeek12Tasks.candy;

public class Candy {

    String brand;
    int quantity;
    boolean containsPeanuts;

    static int totalCandy;
    static String largestConsumer;

    static {
        totalCandy = 500_000;
        largestConsumer = "United States";
    }

    public Candy(String brand, int quantity, boolean containsPeanuts) {
        this.brand = brand;
        this.quantity = quantity;
        this.containsPeanuts = containsPeanuts;
    }

    @Override
    public String toString() {
        return "{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", containsPeanuts=" + containsPeanuts +
                '}';
    }



}
