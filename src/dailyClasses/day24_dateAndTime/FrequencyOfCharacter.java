package dailyClasses.day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,405,60,50,50,50,50,10));

        int count = Collections.frequency(list,50);

        System.out.println(count);

        System.out.println("------------------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,20,30,405,60,50,50,50,50,10,34,10,11,10,39));



        for (Integer each : numbers) {

            if (Collections.frequency(numbers,each)==1){

                System.out.println(each);

            }

        }


        System.out.println("------------------------------------------------------------");

        String str = "aaaaaabbbbbbddddddddqqqqqqqq";
        String result = "";

        for ( String each : (str.split(""))){

            int frequency =  Collections.frequency(Arrays.asList(str.split("")),each);

            if (!result.contains(each)){

                result+=each+frequency;
            }



        }

        System.out.println(result);


    }

}
