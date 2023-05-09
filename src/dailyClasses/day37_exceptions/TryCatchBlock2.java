package dailyClasses.day37_exceptions;

public class TryCatchBlock2 {

    public static void main(String[] args) {

        System.out.println("Program 1 started");

        int[] arr = {1,2,3,4};

        try {
            System.out.println(arr[1000]);
        }catch (RuntimeException e){
            e.printStackTrace(); //display full details of exception after the execution of program

        }

        System.out.println("Program 1 ended");
    }

}
