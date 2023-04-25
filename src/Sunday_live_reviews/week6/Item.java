package Sunday_live_reviews.week6;

public class Item {

    public String name;
    public int quantity;
    public double unitPrice;

    public void setInfo(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public void sellItem(int num) {
        double totalPrice = num * unitPrice;
        if (quantity >= num) {
            System.out.println("Selling: " + num + " " + name + " for: $" + totalPrice);
            quantity -= num;
            System.out.println("Thank you for your purchase, we have " + quantity + " " + name + " left if you would like more");
        } else {
            System.err.println("Sorry, there is not enough product in stock");
        }

    }


    public String toString() {
        return "ITEM: " + name + " | " + quantity + " | $" + unitPrice;
    }
}
