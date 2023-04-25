package Sunday_live_reviews.week9.VendingTask;

import java.util.ArrayList;

public class DrinkVending {

    public ArrayList<Drink> allDrinks;


    public DrinkVending() {
        this.allDrinks = new ArrayList<>();
    }

    public DrinkVending(ArrayList<Drink> inputDrinks) {
        this();
        //  this.allDrinks = new ArrayList<>(allDrinks);
        this.allDrinks.addAll(inputDrinks);
    }


    public void stock(ArrayList<Drink> newDrinks) {

        outer:
        for (Drink each : newDrinks) { // each is the new Drinks

            for (Drink vending : allDrinks) { // vending is the existing drinks
                if (vending.name.equalsIgnoreCase(each.name)) {
                    vending.quantity += each.quantity;
                    continue outer; // if this runs the drink will not be duplicated in our vending
                }
            }

            allDrinks.add(each); // if the Drink is not in the machine already it will be added

        }
    }


    public void vend(String name) {

        boolean isAvailable = false;

        for (int i = 0; i < allDrinks.size(); i++) {

            if (allDrinks.get(i).name.equals(name)) {
                System.out.println(name + " price is: $" + allDrinks.get(i).price);

                if (allDrinks.get(i).quantity > 0) {
                    allDrinks.get(i).quantity -= 1;
                    isAvailable = true;
                    break;

                } else {

                    System.out.println("Sorry " + allDrinks.get(i).name + " is out of stock");
                    isAvailable = true;
                    break;
                }

            }

        }
        if (!isAvailable) {
            System.out.println("Sorry " + name + " is not offered");
        }
    }

    // public void stock (ArrayList<Drink> listOfDrinks){
    //    allDrinks.addAll(listOfDrinks);

    //   }


    public String toString() {
        String output ="";
        for (Drink each : allDrinks) {
            output+=each+"\n";
        }
        return output;
    }
}
