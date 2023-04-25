package officeHours.officeHoursWeek07Tasks;

/*

T1ColorPicker [loop, Scanner, String]

    Create a program that will allow the user to select three unique colors.
    Ask the user to enter their colors one at a time. Verify the color hasn't been selected already. If the color is unique add it to the final selection otherwise tell the user the colors should be unique and allow them to reenter a different color. The number of iterations is not fixed

    Ex flow:
        Enter color 1:
            > red
        red added
        Enter color 2:
            > red
        red is already selected
        Enter color 2:
            > green
        green added
        Enter color 3:
            > red
        red is already selected
        Enter color 3:
            > green
        green is already selected
        Enter color 3:
            > orange
        orange added

        Here are the colors you picked: red, green, orange

 */

import java.util.Scanner;

public class T1ColorPicker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String colorSelection = "Here are the colors you picked: ";

        for (int i = 1; i < 4; i++) {

            System.out.print("Enter color" + i + "\n> ");
           String color =  input.nextLine();

            while (colorSelection.toLowerCase().contains(color.toLowerCase()+", ")) {
                System.out.println(color + " is already selected.\n Enter color" + i + ":\n>");
                color = input.nextLine();
            }

            colorSelection += color + ", ";
            System.out.println(color + " added");

        }

        System.out.println(colorSelection);


    }

}
