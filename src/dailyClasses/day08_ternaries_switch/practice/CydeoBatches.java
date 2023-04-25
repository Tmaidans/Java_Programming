package dailyClasses.day08_ternaries_switch.practice;

/*

10. Create a class named CydeoBatches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

 */

public class CydeoBatches {

    public static void main(String[] args) {

        String batch = "EU";

        String info1 = "";

        if (batch == "US morning") {
            info1 = "Class times are 10-5 EST. M, T, Th, F.";
        } else if (batch == "Us evening") {
            info1 = "Class times are 7-10 EST. M, T, W, Th, S, S";
        } else if (batch == "EU") {
            info1 = "Class times are  10-5 EST. M, T, W, Th, F.";
        } else {
            info1 = "Invalid Batch";
        }

        System.out.println("info1 = " + info1);

        System.out.println("---------------------------------------------------------------------");

        String info2="";

            switch (batch){

                case "US morning":
                    info2 = "Class times are 10-5 EST. M, T, Th, F.";
                    break;

                case "US evening":
                    info2 = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;

                case "EU":
                    info2 = "Class times are  10-5 EST. M, T, W, Th, F.";
                    break;

                default:
                    info2 = "Invalid Batch";

            }

        System.out.println("info2 = " + info2);

        System.out.println("------------------------------------------------------------------------");



    }

}
