package dailyClasses.day08_ternaries_switch.practice;

/*

1. Create a class called NumberToWord,
		write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: MUST use ternary

 */

public class NumberToWord {

    public static void main(String[] args) {

        int number = 6;

        String word;

        word = (number == 1) ? "one" : (number == 2) ? "two" : (number == 3) ? "three" : (number == 4) ? "four"
                : (number == 5) ? "five" : "six";

        System.out.println(word);

    }

}
