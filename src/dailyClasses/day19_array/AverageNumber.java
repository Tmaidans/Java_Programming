package dailyClasses.day19_array;

import java.util.Scanner;
import java.util.Arrays;

public class AverageNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many number would you like to enter?");
        int range = input.nextInt();

        double[] average = new double[range];
        double sum = 0;

        for (int i = 0; i < range; i++) {
            System.out.println("Please enter your number:");
            average[i] = input.nextInt();
            sum += average[i];
        }

        System.out.println("Average is: " + (sum / range));

    }



}


