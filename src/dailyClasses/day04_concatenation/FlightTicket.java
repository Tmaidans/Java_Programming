package dailyClasses.day04_concatenation;

/*
1. Create a class named FlightTicket.java
2. Declare the following variables:
    1. from
    2. to
    3. ticketPrice
3. Use concatenation to print the full ticket information
    Ex:
        From Las Vegas to McLean is $425.5
 */

public class FlightTicket {

    public static void main(String[] args) {

        String origin = "Las Vegas",
                destination = "McLean";
        double ticketPrice = 425.5;

        System.out.println("From " + origin + " to " + destination +" $" + ticketPrice);


    }


}
