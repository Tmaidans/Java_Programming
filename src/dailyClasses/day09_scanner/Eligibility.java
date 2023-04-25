package dailyClasses.day09_scanner;

import java.util.Scanner;

public class Eligibility {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your age: ");

        int age = scan.nextInt();

        if (age>=21){
            System.out.println("Eligible to buy alcohol and smokes");
        }else{
            System.err.println("STOP - do not buy that crap");
        }

        scan.close();

    }

}
