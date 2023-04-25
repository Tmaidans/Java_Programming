package dailyClasses.day20_forEach.Practice;

public class EvenAndOdd {

    public static void main(String[] args) {

        int even = 0;
        int odd = 0;

        int[] arr = {1,2,3,4,5,6,44,6,21,3,4,6,234,56,2,3,6,4,6,3,4};

        for (int each : arr) {
            if (each%2==0){
                even++;
            }
            if(each%2!=0){
                odd++;
            }
        }

        System.out.println("odd = " + odd);
        System.out.println("even = " + even);

    }

}
