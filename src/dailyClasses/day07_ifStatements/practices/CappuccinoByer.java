package dailyClasses.day07_ifStatements.practices;

/*

1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"

			Note: MUST use nested if

 */

public class CappuccinoByer {

    public static void main(String[] args) {

        String givenSize = "suka";

        String result = "";

        if (givenSize == "tall" || givenSize == "grande" || givenSize == "venti") {

            if (givenSize == "tall") {
                result = "price is $3.69\n90 calories";
            } else if (givenSize == "grande") {
                result = "price is $3.99\n120 calories";
            } else {
                result = "price is $4.29\n150 calories";
            }

            System.out.println(result);
        } else {
            System.out.println("Invalid Size");
        }


    }
}
