package dailyClasses.day09_scanner;

import java.util.Scanner;

public class NextLineVsNext {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Your age: ");
        int age = input.nextInt(); // 45+enter

        input.nextLine(); // enter - is being take out from the previous entry

        System.out.println("Please Enter Full Name:");
        String name = input.nextLine();

        System.out.println("You are " + age + " years old and your name is " + name);

        input.close();

    }
}
