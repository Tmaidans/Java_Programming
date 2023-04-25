package replits;


import java.util.Scanner;

public class ReplitTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }


    public static String coverString(String main, String coverMe) {
        // your code here

        String coverString = "";
        String replacement = "[" + coverMe + "]";


        if (main.contains(coverMe)) {
            main = main.replaceFirst(coverMe, replacement);
            int bracket = main.indexOf("]");
            coverString += main.substring(0, bracket+1);
            main=main.substring(bracket+1);
            int counter = 1;

            for (int i = 0; i != counter; i++) {

                if (main.contains(coverMe)) {
                    main = main.replaceFirst(coverMe, replacement);
                    bracket = main.indexOf("]");
                    coverString += main.substring(0, bracket+1);
                    main=main.substring(bracket+1);
                    counter += 1;
                } else {
                    coverString += main.substring(0);
                }
            }

        } else {
            coverString = "[" + main + "]";
        }

        return coverString;


    }
}

