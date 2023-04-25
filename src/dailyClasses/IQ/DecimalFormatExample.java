package dailyClasses.IQ;


import java.text.DecimalFormat;

public class DecimalFormatExample {


    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        double n1 = 10.5876;

        System.out.println(df.format(n1));

    }

}
