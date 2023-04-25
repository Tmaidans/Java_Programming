package dailyClasses.day19_array;

import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0] = "Gulchin";
        myGroup[1] = "Abidullah";
        myGroup[2] = "Sumeye";
        myGroup[3] = "Khashavar";
        myGroup[myGroup.length - 1] = "Aseel";

        System.out.println(Arrays.toString(myGroup));

        myGroup[1] = "Kuzzat";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("--------------------------------------------------");


        for (int i = myGroup.length - 1; i >= 0; i--) {

            System.out.print(myGroup[i] + " ");

        }

        System.out.println("--------------------------------------------------");

        for (int i = myGroup.length - 1; i >= 0; i--) {

        }

        System.out.println("--------------------------------------------------");

        int[] task1 = new int[100];

        for (int i = 0, j=10; i < task1.length; i++,j+=10) {

            task1[i] = j;
        }

        System.out.println(Arrays.toString(task1));

        System.out.println("--------------------------------------------------");

        for (int i = 0; i < task1.length; i++) {
            task1[i]= i+1;
        }

        System.out.println(Arrays.toString(task1));

        System.out.println("--------------------------------------------------");



        int[] task2 = new int[100];

        for (int i = 0,j=task2.length; i < task2.length; i++,j--) {

            task2[i]= j;

        }

        System.out.println(Arrays.toString(task2));

        System.out.println("--------------------------------------------------");

        for (int i = task2.length - 1; i >= 0; i--) {
            task2[i]= i+1;
        }

        System.out.println(Arrays.toString(task2));

    }

}
