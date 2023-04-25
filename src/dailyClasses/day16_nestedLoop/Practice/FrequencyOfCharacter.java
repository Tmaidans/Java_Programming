package dailyClasses.day16_nestedLoop.Practice;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "aabfafafadfafcccddddd";
        String newStr = "";


        for (int i = 0; i < str.length(); i++) {

            int counter = 0;

            if (!(newStr.contains("" + str.charAt(i)))) {
                newStr += str.charAt(i);

                for (int j = 0; j < str.length(); j++) {

                    if (str.charAt(i) == str.charAt(j)) {
                        counter += 1;
                    }

                }

                newStr += counter;

            }

        }

        System.out.println("newStr = " + newStr);

    }
}