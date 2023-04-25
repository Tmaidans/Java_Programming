package dailyClasses.day10_string;

import java.util.Scanner;

public class StringMethods1 {

    public static void main(String[] args) {

        String str = "Cydeo";
        //  index:    01234

        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);
        char thirdChar = str.charAt(2);
        char forthChar = str.charAt(3);
        char fifthChar = str.charAt(4);

        //char sixthChar = str.charAt(5);


        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("forthChar = " + forthChar);
        System.out.println("fifthChar = " + fifthChar);

        //System.out.println("sixthChar = " + sixthChar);


        System.out.println("---------------------------------------------------------");

        String sentence = "Java Programming Language";

        int numberOfCharacters = sentence.length();
        int lastIndex = numberOfCharacters - 1;

        System.out.println("numberOfLetters = " + numberOfCharacters);
        System.out.println("lastIndex = " + lastIndex);

        System.out.println("---------------------------------------------------------");

        String s1 = "Java is the best programming language";

        char firstCharacter = s1.charAt(0);
        char lastCharacter = s1.charAt(s1.length() - 1);

        System.out.println("firstCharacter = " + firstCharacter);
        System.out.println("lastCharacter = " + lastCharacter);

        System.out.println("---------------------------------------------------------");

        String name1 = "Umran";
        String name2 = new String("Umran");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        System.out.println("---------------------------------------------------------");

        String r1 = "Java";
        String r2 = "Java";

        String r3 = new String("Java");

        System.out.println(r1 == r2); // true
        System.out.println(r1 == r3); // false
        System.out.println(r2 == r3); //false

        System.out.println(r1.equals(r3)); // only compares the text - true
        System.out.println(r2.equals(r3)); // true

        System.out.println("---------------------------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("Are you a US citizen? yes/no");
        String answer = input.next();

            if(age>=21 && answer.equals("yes")){
                System.out.println("You are eligible to vote");
            }else{
                System.err.println("Sorry, you are not eligible to vote");
            }

input.close();

    }

}
