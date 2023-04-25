package dailyClasses.day07_ifStatements;

public class NestedIFIntro {

    public static void main(String[] args) {

        int score = -96;


        if (score >= 0 && score <= 100) { //if the score is valid

            if (score >= 60) { // if the score is greater or equal to 60
                System.out.println("Passed");
            } else { //if the score is less than 60
                System.out.println("Failed");
            }

        } else { // if the score is not valid (outside the range of given parameters)
            System.out.println("Invalid score");
        }

        System.out.println("---------------------------------------------------------------");

        int age = 120; //given age has to be between 1~100

        if (age >= 1 && age <= 100) {

            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("not eligible");
            }

        } else {
            System.out.println("Age is invalid");
        }

        System.out.println("---------------------------------------------------------------");

        int day = 5;


        if (day ==1){
            System.out.println("Monday");
        }else if (day ==2){
            System.out.println("Tuesday");
        }


    }
}
