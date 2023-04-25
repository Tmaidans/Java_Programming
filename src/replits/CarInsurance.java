package replits;

import java.util.Scanner;

public class CarInsurance {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double premiumCost = 0;

        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        int space = fullName.indexOf(' ');
        String firstName = fullName.substring(0, space);
        String lastName = fullName.substring(space + 1);
        firstName = firstName.toUpperCase().substring(0, 1) + firstName.substring(1);
        lastName = lastName.toUpperCase().substring(0, 1) + lastName.substring(1);
        fullName = firstName + " " + lastName;

        System.out.println("Do you have a US driver license?");
        String hasLicense = input.nextLine().toLowerCase();
        boolean trueLicense = hasLicense.contains("yes");

        if (trueLicense) {

            System.out.println("Enter your zip code");
            int zip = input.nextInt();

            switch (zip) {

                case 20910:
                case 20740:
                    premiumCost += 60;
                    break;

                case 22102:
                case 22103:
                    premiumCost += 30;
                    break;
                default:
                    premiumCost += 50;
            }


            input.nextLine();

            System.out.println("Is this vehicle owned, financed, or leased?");
            String ownership = input.nextLine().toLowerCase();

            switch (ownership) {

                case "owned":
                    premiumCost += 10;
                    break;
                case "financed":
                    premiumCost += 15;
                    break;
                case "leased":
                    premiumCost += 20;

            }


            System.out.println("How is this vehicle primarily used?");
            String carUsage = input.nextLine().toLowerCase();

            if (carUsage.equals("commuting")) {
                System.out.println("How many days do you commute?");
                int daysCommute = input.nextInt();
                premiumCost += 20 + 5 * daysCommute;
            } else if (carUsage.equals("business")) {
                premiumCost += 50;
            } else if (carUsage.equals("pleasure")) {
                premiumCost += 10;
            }


            System.out.println("How old are you?");
            int age = input.nextInt();

            if (age < 16) {
                System.out.println("You can't be driving");
                System.exit(0);
            } else if (age > 15 && age < 20) {
                premiumCost *= 10;
            } else if (age > 19 && age < 25) {
                premiumCost *= 5;
            } else
                premiumCost *= 2;


            System.out.println("Have you had any accidents in the last 5 years?");
            String accidents = input.next().toLowerCase();
            boolean hadAccident = accidents.contains("yes");

            if (hadAccident) {
                System.out.println("How many?");
                int accidentcount = input.nextInt();
                premiumCost += 10 * accidentcount;
            }

                input.nextLine();

                System.out.println("What is the highest level of education you have completed?");
                String education = input.nextLine().toLowerCase();
                switch (education) {

                    case "bachelors":
                    case "masters":
                        premiumCost -= premiumCost * 0.05;
                        break;
                    case "phd":
                        premiumCost -= premiumCost * 0.1;
                        break;
                    case "high school":
                        premiumCost += premiumCost * 0.05;
                        break;
                }

                if (education.equals("high school")) {
                    education = education.substring(0, 4) + education.substring(5, 11);
                String referenceNumber = firstName.substring(0, 2) + age + lastName.substring(lastName.length() - 3) + zip + education;

                }
                String referenceNumber = firstName.substring(0, 2) + age + lastName.substring(lastName.length() - 3) + zip + education;

                System.out.println(fullName + ", here's your quote!");
                System.out.println("This is your start premium cost: $" + premiumCost);
                System.out.println("This is your reference number: " + referenceNumber.toUpperCase());

            } else {
                System.out.println("You must have a license to get insurance!");
                System.exit(0);
            }

        }


    }


