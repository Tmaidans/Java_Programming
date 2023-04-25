package dailyClasses.day15_whileLoop.Practice;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Are you looking to reserve a room?");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes")||answer.equals("no"))){
                System.out.println("Please enter a valid answer");
                answer=input.next().toLowerCase();
            }

            if(answer.equals("yes")){

                System.out.println("Which type of room would you like to reserve? ");
                input.nextLine();
                String room = input.nextLine().toLowerCase();

                boolean king = room.equals("king");

                while (!(king||room.equals("queen")||room.equals("single"))){

                    System.out.println("Please enter a valid room type: ");
                        room = input.nextLine().toLowerCase();
                }
                if (room.equals("king")){
                    System.out.println("King Bed ==> 120$");
                }else if (room.equals("queen")){
                    System.out.println("Queen Bed ==> 100$");
                }else{
                    System.out.println("Single Bed ==> 80$");
                }


            }else {
                System.out.println("Have a nice day!!!");
            }


    }
}
