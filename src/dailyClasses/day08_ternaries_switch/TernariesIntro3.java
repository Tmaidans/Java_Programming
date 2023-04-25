package dailyClasses.day08_ternaries_switch;

public class TernariesIntro3 {

    public static void main(String[] args) {

        int score = 196;

       /* String result;
        if (score >= 0 && score <= 100) { //if the score is valid

            if (score >= 60) { // if the score is greater or equal to 60
                result = "Passed";
            } else { //if the score is less than 60
                result = "Failed";
            }


        } else { // if the score is not valid (outside the range of given parameters)
            result = "Invalid score";
        }

        System.out.println(result);
                */

        String result = (score >= 0 && score <= 100) ? (score >= 60) ? "Passed" : "Failed" : "Invalid Score";

        System.out.println(result);

        System.out.println("---------------------------------------------------------------------------------");



    }
}
