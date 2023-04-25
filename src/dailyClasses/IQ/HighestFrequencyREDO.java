package dailyClasses.IQ;

public class HighestFrequencyREDO {


    public static void main(String[] args) {

        String str = "aavbbbbvv";
        String highFrequency = "";
        int counter = 0;
        boolean largest = true;
        for (int i = 0; i < str.length(); i++) {

            char testCart = str.charAt(i);

            for (int j = 1; j < str.length(); j++) {

                if (counter(str, testCart) < counter(str, str.charAt(j))) {
                    break;
                }
                if (counter(str, testCart) >= counter(str, str.charAt(j)) && str.charAt(j) != str.charAt(str.length() - 1)) {
                    continue;
                }
                if ((str.charAt(j) == str.charAt(str.length() - 1)) && !highFrequency.contains("" + str.charAt(i))) {
                    highFrequency += str.charAt(i)+"\n";
                }


            }


        }

        System.out.println(highFrequency);

    }

    public static int counter(String str, char check) {

        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == check) {
                counter++;
            }
        }
        return counter;
    }

}

