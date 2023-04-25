package dailyClasses.day08_ternaries_switch.practice;

/*

2. Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.

 */

public class Loans {

    public static void main(String[] args) {

        double salary = 60_000;
        int score = 630;

        String result;


        result = (salary >= 60000 && score >= 650) ? "Loan Approved" : "Loan Denied";

        System.out.println(result);

    }

}
