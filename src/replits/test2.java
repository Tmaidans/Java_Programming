package replits;

import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW

        //xxxabyyyycd

        int counterFinal = 0;

        for (int i = 0; i < str.length(); i++) {

            int counter = 0;
            char first = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {

                if (first == str.charAt(j)) {
                    counter++;
                }

            }

            if(counter>=3){
                counterFinal+=counter-2;
            }

        }

        System.out.println(counterFinal/3);

    }
}