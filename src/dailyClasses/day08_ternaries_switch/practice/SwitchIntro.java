package dailyClasses.day08_ternaries_switch.practice;

public class SwitchIntro {

    public static void main(String[] args) {

        char grade ='A';

        /*
        A: Excellent
        B: Great Job
        C: Good
        D: Passed
        F: Failed
         */
/*
        String result;

        if (grade == 'A') {
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great Job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        } else {
            result = "Failed";
        }

        System.out.println(result);

 */

        System.out.println("------------------------------------------------------------------------");

        String result2="";

        switch (grade){

            case 'A':
                result2="Excellent";


            case 'B':
                System.out.println("Great Job");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Number not found");
                break;

        }

        System.out.println(result2);













    }
}
