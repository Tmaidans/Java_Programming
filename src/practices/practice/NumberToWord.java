package practices.practice;

/*

2. Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement

 */


public class NumberToWord {

    public static void main(String[] args) {

        int givenNumber = 0;

        boolean zero = givenNumber ==0,
                one = givenNumber == 1,
                two = givenNumber == 2,
                three = givenNumber == 3,
                four = givenNumber == 4,
                five = givenNumber == 5,
                six = givenNumber == 6,
                seven = givenNumber == 7,
                eight = givenNumber == 8,
                nine = givenNumber == 9;

        String answer = "";

        if (zero) {
            answer = "zero";
        }
        if (one) {
            answer = "one";
        }
        if (two) {
            answer = "two";
        }
        if (three) {
            answer = "three";
        }
        if (four) {
            answer = "four";
        }
        if (five) {
            answer = "five";
        }
        if (six) {
            answer = "six";
        }
        if (seven) {
            answer = "seven";
        }
        if (eight) {
            answer = "eight";
        }
        if (nine) {
            answer = "nine";
        }

        System.out.println(answer);

    }
}
