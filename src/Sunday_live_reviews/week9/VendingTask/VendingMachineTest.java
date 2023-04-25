package Sunday_live_reviews.week9.VendingTask;

import java.util.ArrayList;
import java.util.Arrays;

public class VendingMachineTest {

    public static void main(String[] args) {

        Drink vodka = new Drink("Vodka", 20, 4);
        Drink tequila = new Drink("Tequila", 4, 5);
        Drink beer = new Drink("Beer", 2, 20);
        Drink wine = new Drink("Wine", 15, 2);
        Drink juice = new Drink("Juice", 5, 20);

        ArrayList<Drink> alcohol = new ArrayList<>(Arrays.asList(wine, juice, vodka, tequila, beer));

        DrinkVending vendingMachine = new DrinkVending();
        vendingMachine.allDrinks.addAll(alcohol);

        System.out.println("vendingMachine = " + vendingMachine);


        System.out.println("--------------------------------------------------------------------------");

        vendingMachine.vend("Wine");

        System.out.println("--------------------------------------------------------------------------");


        System.out.println("importedDrinks = " + alcohol);
        System.out.println("vendingMachine = " + vendingMachine);

        //  System.out.println(importedDrinks);
    }

}
