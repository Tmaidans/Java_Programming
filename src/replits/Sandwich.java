package replits;

import java.util.Scanner;

public class Sandwich {

    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW

        if (str.contains("bread")) {

            int breadStart = str.indexOf("bread");
            str = str.substring(breadStart + 5);


            if (str.contains("bread")) {

                int breadEnd = str.lastIndexOf("bread");
                str = str.substring(0, breadEnd);
                System.out.println(str);
            } else {
                System.out.println("nothing");
            }

        } else {
            System.out.println("nothing");


        }
    }
}

