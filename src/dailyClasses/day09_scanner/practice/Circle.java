package dailyClasses.day09_scanner.practice;

/*

2. Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius

 */

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please Enter Circle Radius: ");

        double radius = scan.nextDouble();
        double area = radius*3.14159;
        double perimeter = 2*3.14159*radius;

        System.out.println("Area of the circle is: " + area);
        System.out.println("Perimeter of the circle is: " + perimeter);

       scan.close();





    }
}
