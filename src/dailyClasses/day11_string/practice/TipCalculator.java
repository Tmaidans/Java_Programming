package dailyClasses.day11_string.practice;

/*

8. Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75

 */

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Are we splitting the bill?");
        String split = input.nextLine();

        System.out.println("How many people are in the party?");
        int peopleNum = input.nextInt();

        System.out.println("How much was your bill?");
        double checkSum = input.nextDouble();

        input.nextLine();

        System.out.println("How was your service? (Poor, Fair, Good, Great, Excellent");
        String serviceQuality = input.nextLine();

        double tip = 0;

        switch (serviceQuality.toLowerCase()) {

            case ("poor"):
                tip = 0.05;
                break;

            case ("fair"):
                tip = 0.1;
                break;

            case ("good"):
                tip = 0.15;
                break;

            case ("great"):
                tip = 0.2;
                break;

            case ("excellent"):
                tip = 0.25;
                break;

        }

        double totalBill = checkSum + checkSum * tip,
                perPerson, tipPer;

        //-------------------------------------------

        if (split.equalsIgnoreCase("yes")) {
            perPerson = totalBill / peopleNum;
            tipPer = checkSum * tip / peopleNum;
            System.out.println("Number of people entered: " + peopleNum);
            System.out.println("Total to pay: " + (checkSum + ((checkSum * tip))));
            System.out.println("Total tip: " + (checkSum * tip));
            System.out.println("Total per person: " + perPerson);
            System.out.println("Tip per person: " + tipPer);
        } else {
            System.out.println("Number of people entered: " + peopleNum);
            System.out.println("Total to pay: " + (checkSum + ((checkSum * tip))));
            System.out.println("Total tip: " + (checkSum * tip));
        }


        input.close();

    }

}
