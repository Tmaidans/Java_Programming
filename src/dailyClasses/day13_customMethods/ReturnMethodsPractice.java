package dailyClasses.day13_customMethods;

public class ReturnMethodsPractice {

    public static void main(String[] args) {

        System.out.println("isOdd(3) = " + isOdd(3));
        System.out.println("isEven(3) = " + isEven(3));

        System.out.println("-------------------------------------------------");

        System.out.println("min - " + min(3, 5));
        System.out.println("max - " + max(6, 4));
    }

    public static boolean isOdd(int num) {

        boolean isOdd = num % 2 != 0;

        return isOdd;
    }

    public static boolean isEven(int num) {

        return !isOdd(num);
    }

    public static double max(double num1, double num2) {

        //return n1>n2 ? n1 : n2; - ternary

        if (num1 > num2) {
            return num1;
        }
        return num2;

    }

    public static double min(double num1, double num2) {

        if (num1 < num2) {
            return num1;
        }
        return num2;
    }
}
