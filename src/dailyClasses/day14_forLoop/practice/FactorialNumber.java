package dailyClasses.day14_forLoop.practice;


public class FactorialNumber {

    public static void main(String[] args) {

        int number = 4;
        int factorial=1;

        for (int i = number; i >= 1; i--) {

            factorial*=i;

        }

        System.out.println(factorial);

    }

}
