package dailyClasses.day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {

        String[] group1 = {"James", "Daniel"};
        String[] group2 = {"Tim", "Jimmy", "Jessica"};
        String[] group3 = {"Adam", "Billy", "Muhtar", "Asia", "Kuzzat"};
        String[] group4 = {"BillyBob", "Dingus"};

        String[][] groups = {group1, group2, group3, group4};

        for (String[] each1DArr : groups) {
            System.out.println(Arrays.toString(each1DArr));
        }

        System.out.println("---------------------------------------------------------");

        for (String[] each1DArr : groups) {

            for (String each : each1DArr) {
                System.out.println(each);
            }
        }

        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachName = eachGroup[j];
                System.out.println(eachName);
            }
        }

        System.out.println("---------------------------------------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String each : eachGroup) {
                System.out.println(each);
            }
        }

        System.out.println("---------------------------------------------------------");

        System.out.println(groups);

        System.out.println(Arrays.toString(groups)); //toString () ==> for single dimensional arrays ONLY

        System.out.println(Arrays.deepToString(groups)); //deepToString () ==> for multi dimensional arrays

        System.out.println(Arrays.deepToString(groups[1]));
    }

}
