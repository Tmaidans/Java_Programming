package dailyClasses.day04_concatenation;

/*
1. Create a class named ShippingAddress.java
2. Declare the following variables:
    1. name
    2. buildingNumber
    3. streetName
    4. city
    5. state
    6. zipCode
3. Use concatenation to print the full shipping address
    Ex:
    Your Shipping address is:
        Aaron Kissinger
        13621A Legacy Circle
        Fairfax, VA 22030
 */

public class ShippingAddress {

    public static void main(String[] args) {

        String shipperName = "Aaron Kissinger",
                buildingNumber = "13621A",
                streetName = "Legacy Circle",
                strNumberStrName = buildingNumber + " " + streetName,
                cityName = "Fairfax",
                state = "VA";
        int zipCode = 22030;

        System.out.println("Your Shipping address is:" +
                "\n\t" + shipperName +
                "\n\t" + strNumberStrName +
                "\n\t" + cityName + ", " +
                state + " " + zipCode);


    }


}
