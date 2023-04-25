package officeHours.officeHoursWeek04Tasks;

/*

You are in a baking contest and tour cookies will be rated by 3 judges.

	Create a program that will define 3 scores for your cookies. Calculate the average score you earned.
	Then also define two other people's final score and determine which place you earned int the baking contest

		you can earn either: First place, Second place, or Third place

		Ex:
			input:
				your score = 8.5, 7.9, 8.3
				other people score = 8.5 and 7.9

				output: Congratulations you earned Second place with a score of: 8.2
					-> don't worry about decimal formatting

 */

import java.sql.SQLOutput;

public class T2BakingContest {

    public static void main(String[] args) {

        double  judge1 = 2.5,
                judge2 = 9.9,
                judge3 = 9.3,
                contestant1 = 6,
                contestant2 = 6;

        double yourScoreAverage = (judge2 + judge1 + judge3) / 3;

        String result = "";


        if (yourScoreAverage > contestant2 && yourScoreAverage > contestant1) {
            result = "First";
        } else if (yourScoreAverage < contestant1 && yourScoreAverage < contestant2) {
            result = "Third";
        } else {
            result = "Second";
        }

        System.out.println("Congratulations you earned " + result + " place with a score of " + yourScoreAverage);

    }
}
