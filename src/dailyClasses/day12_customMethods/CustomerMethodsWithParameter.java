package dailyClasses.day12_customMethods;


public class CustomerMethodsWithParameter {

    public static void main(String[] args) {

        eveOrOdd(4);


        System.out.println("---------------------------------------------------------");

        int checkNumber = 3;

        isEligible(checkNumber);

        System.out.println("---------------------------------------------------------");

        evenOddZero(checkNumber);

        System.out.println("---------------------------------------------------------");

        String firstName = "tim";
        String lastName = "Maidans";

        initials(firstName, lastName);

    }

    //checks if number is even or odd
    public static void eveOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    //check if eligible to buy alcohol
    public static void isEligible(int age) {
        if (age > 20) {
            System.out.println("Is eligible to drink");
        } else {
            System.out.println("Is not eligible to drink");
        }
    }

    //check if number even, orr or 0
    public static void evenOddZero(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else if (number == 0) {
            System.out.println(number + " is zero");
        } else {
            System.out.println(number + " is odd");
        }

    }

    //print initials with a dot in between
    public static void initials(String firstNane, String lastName) {
        System.out.println(firstNane.toUpperCase().substring(0, 1) + "." + lastName.toUpperCase().substring(0, 1));
        //firstName.charAt(0) + "." + lastName.charAt(0);

    }
}
