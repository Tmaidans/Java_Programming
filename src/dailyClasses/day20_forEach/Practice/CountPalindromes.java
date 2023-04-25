package dailyClasses.day20_forEach.Practice;

/*

3. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2

 */


public class CountPalindromes {

    public static void main(String[] args) {

        String[] arr1 = {"anna", "level", "Java"};
        int count = 0;

        for (String each : arr1) {
            String tested = each;
            if (tested.equalsIgnoreCase(utilities.StringUtility.reverse(tested))){
                count++;
            }
        }

        System.out.println(count);

    }

}
