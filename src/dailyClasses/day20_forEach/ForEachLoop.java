package dailyClasses.day20_forEach;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] number = {10, 20, 30, 40, 50};

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        System.out.println("-------------------------------------------------------------------------");

        for (int each : number) {

            System.out.println(each);
        }

    }

}
