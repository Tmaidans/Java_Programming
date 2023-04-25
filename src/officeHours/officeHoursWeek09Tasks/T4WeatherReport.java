package officeHours.officeHoursWeek09Tasks;

/*

T4WeatherReport [ArrayList, loop, operators]

    Create a program that will define an ArrayList of recent temperatures. There is always extreme temperatures so to get a better reading of the data remove the highest 2 and lowest 2 temperatures. Then give the following information based on the temperature:

        max temperature, min temperature, median (middle temperature), mean (average temperature)

        also, give a prediction temperature range for the next  few days by using the average and both adding and subtracting 5 to create the range. The values for this predication can be whole numbers

        we can assume the data will always be an odd number so there will be one median

    Ex:
        input:
            62.1, 68.9, 55.4, 44.8, 77.3, 43.0, 53.4, 47.1, 55.8, 42.3, 48.5

            // excluded:  42.3, 43.0, 68.9, 77.3
            // data sample: 44.8, 47.1, 48.5, 53.4, 55.4, 55.8, 62.1

        output:
            max: 62.1
            min: 44.8
            median: 53.4
            mean: 52.44
            predication: 47 - 57

 */

import utilities.MathUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class T4WeatherReport {

    public static void main(String[] args) {
        ArrayList<Double> listOfTemp = new ArrayList<>(Arrays.asList(62.2,62.1, 68.9, 55.4, 44.8, 77.3, 43.0, 53.4, 47.1, 55.8, 42.3, 48.5));

        for (int i = 0; i < 2; i++) {
            listOfTemp.remove(Collections.max(listOfTemp));
            listOfTemp.remove(Collections.min(listOfTemp));
        }

        double mean = 0;

        for (Double each : listOfTemp) {

            mean += each;

        }

        double average = mean / listOfTemp.size();

        Collections.sort(listOfTemp);
        System.out.println(listOfTemp);
        System.out.println("Max Temp = " + Collections.max(listOfTemp));
        System.out.println("Min Temp = " + Collections.min(listOfTemp));
        System.out.println("Medium Temp = " + listOfTemp.get(listOfTemp.size() / 2));
        System.out.println("Mean Temp = " + MathUtility.format(average));
        System.out.println("Prediction = " + ((int) average - 5) + " - " + ((int) average + 5));


    }

}
