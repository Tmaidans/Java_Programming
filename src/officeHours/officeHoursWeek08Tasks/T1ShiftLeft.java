package officeHours.officeHoursWeek08Tasks;

/*

T1ShiftLeft [array, loop]

    Create a program that will define an int array with any number of elements. Print out the array with all the elements shifted one position to the left. The first element would be moved to the end

    Ex:
        {1, 2, 3} -> [2, 3, 1]
        {17, 14, 5, 10} -> [14, 5, 10, 17]
        {7, 0, 1} -> [0, 1, 7]

 */


import java.util.Arrays;

public class T1ShiftLeft {

    public static void main(String[] args) {

        int[] array = {7, 0, 1};

        int[] newArray = new int[array.length];
        newArray[newArray.length-1]=array[0];

        for (int i =0 ; i < array.length-1; i++) {
            newArray[i]=array[i+1];

        }


        System.out.println(Arrays.toString(newArray));


    }

}
