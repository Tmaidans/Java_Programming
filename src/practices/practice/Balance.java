package practices.practice;

/*

Balance [single if, operators, variables]

    Declare and assign the following variables
        amount balance & withdraw amount

    Check the balance after the withdrawal
        if you withdrew more money that you had in the account add an overdraft fee of 20 % of the balance

    In both cases print the remaining balance after withdrawing
 */

public class Balance {

    public static void main(String[] args) {

        double accountBalance = 10_000,
                withdrawAmount = 20_000;

        accountBalance -= withdrawAmount;


        if (accountBalance < 0) {
            System.out.println("Overdraft Fee Has Been Applied");
            accountBalance += (accountBalance * 0.2);
        }

        System.out.println("Your final balance is: " + accountBalance);


    }

}


