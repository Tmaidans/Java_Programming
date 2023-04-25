package dailyClasses.day15_whileLoop.Practice;

import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Will you marry me?");
            String answer = input.next().toLowerCase();
            while (!(answer.equals("yes")||answer.equals("no"))){
                System.err.println("Invalid Entry.");
                System.out.println("Will you marry me or not?!?!");
                answer = input.next();
            }

            if (answer.equals("yes")){
                System.out.println("Congratulations!!!");
            }else{
                System.out.println("Goodbye Bitch!");
            }

            input.close();

    }
}
