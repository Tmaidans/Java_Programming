package dailyClasses.day15_whileLoop.Practice;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pos = 0,
                neg = 0,
                num = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println("Please enter number " + i);
            num=input.nextInt();

            if (num>0){
                pos+=1;
            }
            if (num<0){
                neg+=1;
            }
        }

        System.out.println(pos + " positive number and " + neg + " negative numbers");

    }

}
