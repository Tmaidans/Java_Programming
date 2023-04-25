package dailyClasses.IQ;

public class MaxNumber {

    public static void main(String[] args) {

        int [] number = {100,20,500,40,-10,30};

        int max = number[0];

        for (int i = 1; i < number.length; i++) {
            if (number[i]>max){
                max=number[i];
            }
        }

        System.out.println(max);



    }

}
