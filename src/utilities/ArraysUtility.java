package utilities;

import java.util.Arrays;

public class ArraysUtility {

    public static int[] merge(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }

        return arr3;
    }  //merges 2 arrays together, second after the first

    public static double[] merge(double[] arr1, double[] arr2) {

        double[] arr3 = new double[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    public static String[] merge(String[] arr1, String[] arr2) {

        String[] arr3 = new String[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    public static char[] merge(char[] arr1, char[] arr2) {

        char[] arr3 = new char[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }

        return arr3;
    }

    //

    public static int[] reverse(int[] arr1) {

        int[] reverseArr = new int[arr1.length];

        for (int i = arr1.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArr[j] = arr1[i];
        }

        return reverseArr;

    } //reverses all elements in a array

    public static double[] reverse(double[] arr1) {

        double[] reverseArr = new double[arr1.length];

        for (int i = arr1.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArr[j] = arr1[i];
        }

        return reverseArr;

    }

    public static char[] reverse(char[] arr1) {

        char[] reverseArr = new char[arr1.length];

        for (int i = arr1.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArr[j] = arr1[i];
        }

        return reverseArr;

    }

    public static String[] reverse(String[] arr1) {

        String[] reverseArr = new String[arr1.length];

        for (int i = arr1.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArr[j] = arr1[i];
        }

        return reverseArr;

    }

    //

    public static int[] addElement(int[] array, int element) {

        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;

        return new_array;
    } //adds an element to an array at the end of it

    public static double[] addElement(double[] array, double element) {

        double[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;

        return new_array;
    }

    public static String[] addElement(String[] array, String element) {

        String[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;

        return new_array;
    }

    public static char[] addElement(char[] array, char element) {

        char[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;

        return new_array;
    }

    //

    public static boolean contains(int[] array, int element) {

        for (int each : array) {

            if (each == element) {
                return true;
            }

        }

        return false;

    } //check if array contains an element

    public static boolean contains(double[] array, double element) {

        for (double each : array) {

            if (each == element) {
                return true;
            }

        }

        return false;

    }

    public static boolean contains(char[] array, char element) {

        for (char each : array) {

            if (each == element) {
                return true;
            }

        }

        return false;

    }

    public static boolean contains(String[] array, String element) {

        for (String each : array) {

            if (each.equals(element)) {
                return true;
            }

        }

        return false;

    }

    //

    public static String[] reverseEach(String[] words) {
        String[] reversed = new String[words.length];

        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = utilities.StringUtility.reverse(words[i]);
        }

        return reversed;
    } // reverses each word inside an array, but keeps the order same

    //

    public static String longestPalindrome(String[] words) {

        String longest = "";

        for (String each : words) {

            String reverse = StringUtility.reverse(each);

            if (reverse.equals(each) && reverse.length() > longest.length()) {
                longest = each;
            }
        }

        return longest.isEmpty() ? "No Palindrome Found" : longest;
    } // returns the longest palindrome from a string array


    // 

    public static String[] remove(String[] array, int index) {

        String[] newArray = new String[array.length - 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        for (int i = index; i < newArray.length; i++) {
            newArray[i] = array[++index];

        }

        return newArray;

    } //Removes a designated array element at given index

    public static int[] remove(int[] array, int index) {

        int[] newArray = new int[array.length - 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        for (int i = index; i < newArray.length; i++) {
            newArray[i] = array[++index];

        }

        return newArray;

    }

    public static char[] remove(char[] array, int index) {

        char[] newArray = new char[array.length - 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        for (int i = index; i < newArray.length; i++) {
            newArray[i] = array[++index];

        }

        return newArray;

    }

    public static double[] remove(double[] array, int index) {

        double[] newArray = new double[array.length - 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        for (int i = index; i < newArray.length; i++) {
            newArray[i] = array[++index];

        }

        return newArray;

    }

    //

    public static String[] removeDup(String[] array) {

        String[] newArray = new String[0];

        for (int i = 0; i < array.length; ) {

            newArray = utilities.ArraysUtility.remove(array, i);

            if (utilities.ArraysUtility.contains(newArray, array[i])) {
                array = newArray;

            } else {
                i++;
            }
        }

        return array;
    } // removes duplicates from an existing array

    public static double[] removeDup(double[] array) {

        double[] newArray = new double[0];

        for (int i = 0; i < array.length; ) {

            newArray = utilities.ArraysUtility.remove(array, i);

            if (utilities.ArraysUtility.contains(newArray, array[i])) {
                array = newArray;

            } else {
                i++;
            }
        }

        return array;
    }

    public static char[] removeDup(char[] array) {

        char[] newArray = new char[0];

        for (int i = 0; i < array.length; ) {

            newArray = utilities.ArraysUtility.remove(array, i);

            if (utilities.ArraysUtility.contains(newArray, array[i])) {
                array = newArray;

            } else {
                i++;
            }
        }

        return array;
    }

    public static int[] removeDup(int[] array) {

        int[] newArray = new int[0];

        for (int i = 0; i < array.length; ) {

            newArray = utilities.ArraysUtility.remove(array, i);

            if (utilities.ArraysUtility.contains(newArray, array[i])) {
                array = newArray;

            } else {
                i++;
            }
        }

        return array;
    }

    // - Printing a 2D array




}
