package dailyClasses.day15_whileLoop.Practice;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter correct user");

        String username = "";
        int counter =0;
        username=input.next();


        boolean correctUser = username.equals("tim");


        while (!username.equals("tim")){
            System.out.println("Please enter correct user");
                username=input.next();
                counter=1;

        }

        System.out.println("counter = " + counter);


    }
}