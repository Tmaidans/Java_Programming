package officeHours.officeHoursWeek05Tasks;

import java.util.Scanner;

public class T5Angles {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please input first angle");
        int angle1 = input.nextInt();

        System.out.println("please input second angle");
        int angle2 = input.nextInt();

        System.out.println("Please input third angle");
        int angle3 = input.nextInt();

        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("Triangle");
        } else if (angle1 + angle2 + angle3 == 360) {

            System.out.println("Circle");
        } else {
            System.out.println("Cannot Determine");
        }

    }

}
