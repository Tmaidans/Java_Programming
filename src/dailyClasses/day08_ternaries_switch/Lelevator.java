package dailyClasses.day08_ternaries_switch;

/*

1. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cydeo, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

			anything else: print "Invalid floor - 6"

 */

public class Lelevator {

    public static void main(String[] args) {

        int floorNum = 4;

                /*
        if (floorNum >=1 && floorNum <=3) {

            if (floorNum == 1) {
                floor = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
            } else if (floorNum == 2) {
                floor = "Floor 2 selected. Companies: Cydeo, NASA, Intelsat";
            } else {
                floor = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }

        }else {
            floor = "Invalid floor - " + floorNum;
        }

         */
        String floor = "Invalid floor";


        if (floorNum >= 1 && floorNum <= 3) {

            floor = "Floor " + floorNum + " selected. Companies: ";

            if (floorNum == 1) {
                floor += "Lobby, Verizon, Starbucks";
            } else if (floorNum == 2) {
                floor += " Cydeo, NASA, Intelsat";
            } else {
                floor += " Lyft, BofA, Stake house";
            }

        }

        System.out.println(floor);

    }
}
