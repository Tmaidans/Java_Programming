package practices.practice;

/*

Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax

 */

public class NetIncome {

    public static void main(String[] args) {

        String married = "no";
        int salary = 130000;

        double taxRate = 0;
        boolean isMarried = married == "Yes";

        if (salary >= 130000) {
            taxRate = 0.35;
        }
        if (salary >= 100000 && salary <= 129000) {
            taxRate = 0.30;
        }
        if (salary >= 80000 && salary <= 99000) {
            taxRate = 0.25;
        }
        if (salary <= 79000) {
            taxRate = 0.20;
        }
        if (isMarried) {
            taxRate -= 0.05;
        }
        System.out.println("Your net salary is: " + (salary - (salary * taxRate)));

    }
}