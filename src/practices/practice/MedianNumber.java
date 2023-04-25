package practices.practice;

/*

Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

		Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number

 */

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10,
                b = 15,
                c = 20;

        String output = "";

        if (a > b && a < c || a < b && a > c) {
            output = a + " is the median number";
        }
        if (b > a && b < c || b < a && b > c) {
            output = b + " is the median number";
        }
        if (c > b && c < a || c < b && c > a) {
            output = c + " is the median number";
        }


        System.out.println(output);

    }


}
