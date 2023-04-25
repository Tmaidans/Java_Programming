package dailyClasses.day07_ifStatements;

/*

1. Create a class named LoanApplication. two variables named salary and createdScore are declared and given, write a program that can check if the person is eligible to apply for a loan
            Note:In order to be eligible for a loan:
                    1. salary: at least 45K
                    2. credit score: at least 700

 */

public class LoanApplication {

    public static void main(String[] args) {

        int salary = 45_000,
                creditScore = 700;

        boolean eligibility = salary >= 45000 && creditScore >= 700;

        String result;

        if (eligibility) {
            result = "You ARE eligible for the loan";
        } else {
            result = "You are NOT eligible for the loan, Sorry";
        }

        System.out.println("We have evaluated your salary and credit score. \n" + result);

    }


}
