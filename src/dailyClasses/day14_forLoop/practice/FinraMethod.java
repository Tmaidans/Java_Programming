package dailyClasses.day14_forLoop.practice;


public class FinraMethod {

    public static void main(String[] args) {

        int num;

        for (num=1; num <100; num++)

        if (num%3==0 && num%5==0){
            System.out.print("FINRA ");

        }else if (num%3==0){
            System.out.print("FIN ");
        }else if (num%5==0){
            System.out.print("RA ");
        }else{
            System.out.print(num+" ");
        }

    }



}
