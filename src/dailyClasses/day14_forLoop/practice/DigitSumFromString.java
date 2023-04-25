package dailyClasses.day14_forLoop.practice;

public class DigitSumFromString {

    public static void main(String[] args) {

        String input = "2A1B2C36";
        int digits = 0;


        for (int i = 0; i < input.length(); i++) {

            char check = input.charAt(i);

            if (check >= '0' && check <= '9') {

                digits += input.charAt(i) - 48;
            }

        }
        System.out.println("digits = " + digits);


    }


}



