package dailyClasses.day22_arrayList.Practice;

/*

1. Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";


 */


import java.util.Arrays;

public class Retrieve {

    public static void main(String[] args) {

        String str = "Woode1n Spoon!";

        String letter = "",
                digits = "",
                specialCharacters = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digits += str.charAt(i);
            } else if (Character.isLetter(str.charAt(i))) {
                letter += str.charAt(i);
            } else {
                specialCharacters += str.charAt(i);
            }

        }

        System.out.println("letter = " + letter);
        System.out.println("digits = " + digits);
        System.out.println("specialCharacters = " + specialCharacters);

    }

}


