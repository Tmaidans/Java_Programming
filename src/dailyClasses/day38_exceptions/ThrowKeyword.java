package dailyClasses.day38_exceptions;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args)  {

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if (age < 0 || age > 150) {
           throw new InputMismatchException("Invalid age " + age);
        }

        if (age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Ineligible");
        }

        System.out.println("-----------------------------------------------------------------------");

        throw new RuntimeException("Runtime Exception");
      //  System.out.println("Stuff"); - unreachable


    }


}
