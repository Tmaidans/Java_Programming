package Sunday_live_reviews.week9.VendingTask;

public class Drink {

    public String name;
    public double price;
    public int quantity;

    public Drink(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public String toString() {
        return "Drink name: " + name + " | Price: $" + price +" | Quantity: " + quantity +" ";
    }
}
