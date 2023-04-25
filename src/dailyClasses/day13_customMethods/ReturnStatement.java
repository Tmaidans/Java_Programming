package dailyClasses.day13_customMethods;

public class ReturnStatement {

    public static void main(String[] args) {

        eligible(1111);

        System.out.println("------------------------------------------------------------------------");

        System.out.println("Test 1 started");

        boolean exit = true;

        if(exit){
            return; //will exit the current "main" method
        }

        System.out.println("Test 1 Completed");

        System.out.println("Test 2 started");

    }

    public static void eligible(int age) {

        if (age < 0 || age > 150) {
            System.out.println("Invalid age");
            return; //exits the current method
        }
        if (age >= 21) {
            System.out.println("You are eligible to buy alcohol");
        } else {
            System.out.println("You are NOT eligible to buy alcohol");
        }
    }

    public static int multiplication(int n1, int n2){
       // return n1*n2;

        int result = n1*n2;

        return result;// returns the value exiting the mthod
    }
}
