package dailyClasses.day14_forLoop.practice;

public class StringRetrieve {

    public static void main(String[] args) {

        String input = "mn@#123Ab!";
        String letters = "",
                digits = "",
                specialCharacters = "";


        for (int i = 0; i < input.length(); i++) {

            char check = input.charAt(i);

            if ((check >= 'A' && check <= 'Z') || (check >= 'a' && check <= 'z')) {

                letters += input.charAt(i);
            } else if (check >= '0' && check <= '9') {
                digits += input.charAt(i);
            } else {
                specialCharacters += input.charAt(i);
            }

        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialCharacters = " + specialCharacters);

    }


}
