package dailyClasses.day04_concatenation;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(100 + 200); // 300

        System.out.println(40 - 10); // 30


        System.out.println(20.0 / 6); // 3.33333... int divided by double will give you decimal value

        System.out.println(20 / 6); // 3 int divided by int will give and int result

        System.out.println(50d / 6); // conversion to double 8.333333...

        System.out.println((int) (2.5 / 0.5)); //changes double value to int value by casting with a cast

        System.out.println((double) (20 / 6)); // 3 int divided by int will give and int result


        System.out.println(10 * 2); //20


        System.out.println();

        /* Ramainder: numerator - (denominator * integer result)
             10 / 3 = 3.3333333...      ===>       10     -     (3 * 3) = 1
         */

        System.out.println(100 % 13);

        System.out.println(45/8);
    }


}
