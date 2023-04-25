package dailyClasses.day19_array;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        int score1 = 95;
        int score2 = 85;
        int score3 = 75;
        int score4 = 65;
        int score5 = 55;

        System.out.println("------------------------------------------------------");

        int[] scores = new int[5]; // index: 0 ~ 4

        scores[2] = 75;
        scores[0] = 85;
        scores[1] = 78;
        scores[3] = 88;
        scores[4] = 84;

        //   scores = new int[10]; // index: 0 ~ 9
        //  scores = new int[50]; // index 0 ~ 49

        System.out.println(Arrays.toString(scores));

        System.out.println(scores[2]);

        System.out.println("------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) { // i: index number of scores array

            System.out.print(scores[i]+" ");

        }

        System.out.println("------------------------------------------------------");

        System.out.println(scores[scores.length-1]);

        System.out.println("------------------------------------------------------");






    }

}
