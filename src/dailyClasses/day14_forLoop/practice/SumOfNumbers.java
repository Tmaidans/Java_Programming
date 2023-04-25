package dailyClasses.day14_forLoop.practice;

public class SumOfNumbers {

    public static void main(String[] args) {

        int sum=0;
        int givenNum=100;

        for (int num =0; num<=givenNum; num++ ){

            sum+=num;
        }

        System.out.println("sum = " + sum);

    }

}
