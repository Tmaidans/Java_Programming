package officeHours.officeHoursWeek03Tasks;

/*

T2SumDigits [variables, arithmetic & shorthand operators]

    Create a program that will define an int number that ranges from 100 - 999. Take each digit individually and calculate the sum of all the digits

    Ex:
        input: 561
        output: 12
            -> 5 + 6 + 1 = 12

    Extra: Output the result in this format:
        The sum of the digits in $number is $sum
        ex: The sum of the digits in 561 is 12

 */

public class T2SumDigits {

    public static void main(String[] args) {

        int input = 124,

                digit1 = input / 100,
                digit2 = (input - digit1 * 100) / 10,
                digit3 = input - digit1 * 100 - digit2 * 10,
                sum = 0;

        sum = digit1 + digit2 + digit3;

        System.out.println("input: " + input + "\noutput: " + sum);

        System.out.println("\nThe sum of the digits in " + input + " is " + sum);


    }

//package week3.morning;
//
//public class T2SumDigits {
//    /*
//    T2SumDigits [variables, arithmetic & shorthand operators]
//
//    Create a program that will define an int number that ranges from 100 - 999. Take each digit individually and calculate the sum of all the digits
//
//    Ex:
//        input: 561
//        output: 12
//            -> 5 + 6 + 1 = 12
//
//    Extra: Output the result in this format:
//        The sum of the digits in $number is $sum
//        ex: The sum of the digits in 561 is 12
//     */
//
//    public static void main(String[] args) {
//
//        int num = 567; // 56
//
//        /*
//        System.out.println(num % 10); // num % 10 -> allows me to get the last digit
//        System.out.println(num / 10); // / 10 will get rid of the last digit
//        */
//
//        int sum = 0;
//        sum += num % 10; // 567 -> % 10 = 7
//        // full version: sum = sum + num % 10
//        num /= 10; // 567 / 10 = 56
//        // num = num / 10;
//        sum += num % 10; // 56 % 10 -> 6  || sum = 7 + 6
//        num /= 10; // 56 / 10 -> 5
//        sum += num % 10; // 5 % 10 -> 5
//        num /= 10; // 5 / 10 -> 0
//        System.out.println(sum);
//
//    }
//}
}