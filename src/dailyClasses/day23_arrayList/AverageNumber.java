package dailyClasses.day23_arrayList;

import java.util.ArrayList;

public class AverageNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();


        list.add(1);
        list.add(3);
        list.add(4);


        int average = 0;

        for (Integer each : list) {

            average += each;

        }

        double sum = average / list.size();

        System.out.println("Size = " + list.size());

        System.out.println("Average = " + sum);

    }

}
