package dailyClasses.day07_ifStatements.practices;

/*

6. Create a class called FINRA, Write a function which prints out the number. but for number which is a multiple of 3, print "FIN" instead of the number and for number which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3

                output:
                      FIN


                number = 10

	            output:
	                RA


            	number = 15

	            output:
	                FINRA

 */

public class Finra {

    public static void main(String[] args) {

        int number = 1;

        String outpit = "";
        boolean by3 = number % 3 == 0,
                by5 = number % 5 == 0;

        if (by3) {
            outpit += "FIN";
        }
        if (by5) {
            outpit += "RA";
        }
        if (!by3 && !by5){
            outpit += number;
        }


        System.out.println(outpit);

    }


}
