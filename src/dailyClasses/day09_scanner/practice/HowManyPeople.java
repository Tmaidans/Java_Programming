package dailyClasses.day09_scanner.practice;

/*

1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"

 */

import java.util.Scanner;

public class HowManyPeople {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many people do you live with?");

            int people = scan.nextInt();
            String answer="";

            if (people<3){
                answer = "Live with less than 3 people";
            }else if (people >=3 && people <=6){
                answer = "Live with 3 - 6 people";
            }else{
                answer = "Live with more than 6 people";
            }

            scan.close();

        System.out.println(answer);

    }

}
