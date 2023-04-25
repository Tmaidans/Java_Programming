package dailyClasses.day05_operators;

public class LogicalOperators {

    public static void main(String[] args) {

        // &&: and operator, both conditions need ot be true.

        double salary = 60_000;
        int creditScore = 650;

        boolean eligibility = salary >= 30_000 && creditScore >= 650;

        System.out.println("eligibility = " + eligibility);

        System.out.println("-----------------------------------------------");

        int age = 18;
        String country = "USA";

        boolean eligibleToVote = age >= 18 && country == "USA";

        System.out.println("eligibleToVote = " + eligibleToVote);
        ;


        System.out.println("-----------------------------------------------");

        // ||: or operator = either one has to be true

        String answer = "maybe";

        boolean validAnswer = answer == "yes" || answer == "no"; // false - neither one matches the correct condition

        System.out.println("validAnswer = " + validAnswer);

     /*
     String answer = "yes";

        boolean validAnswer = answer == "yes" || answer =="no"; // true - condition matches the set parameter

        System.out.println("validAnswer = " + validAnswer);
      */

        System.out.println("-----------------------------------------------");

        char grade = 'B';

        boolean examPassed = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';

        System.out.println("examPassed = " + examPassed); // true


        System.out.println("-----------------------------------------------");

        // ! Not operator - opposite condition of the boolean

        System.out.println(!true);

        String a = "yes";

        boolean yes = a == "yes"; // true
        boolean no = !yes; // false

        System.out.println("yes = " + yes);
        System.out.println("no = " + no);

        System.out.println("-----------------------------------------------");

        int score = 65;

        boolean passedExam = score >= 60;
        boolean failedExam = !passedExam;

        System.out.println("passedExam = " + passedExam);
        System.out.println("failedExam = " + failedExam);

        System.out.println("-----------------------------------------------");

        System.out.println(true == !false && false == !true && true != !true);
        //   true      &&       true      &&      true


        System.out.println("-----------------------------------------------");

        int month = 9;

        boolean has30Days = month == 9 || month == 4 || month == 6 || month == 11;

        System.out.println("has30Days = " + has30Days);

        boolean number = 100 > 3;
        boolean numberNegative = !number;

        System.out.println("numberNegative = " + numberNegative);

    }

 
}
