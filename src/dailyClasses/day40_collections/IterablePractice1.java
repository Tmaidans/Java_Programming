package dailyClasses.day40_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IterablePractice1 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 1, 2, 3, 3, 3, 1, 2, 3, 3, 3, 1, 2, 3, 8, 6, 6, 5,9));

        //find the nth largest number

        int n = 5;

        for (int i = 0; i < n-1; i++) {
            numbers.removeIf(p -> Collections.max(numbers)==p);
        }

        int max = Collections.max(numbers);

        System.out.println(max);

    }



}
