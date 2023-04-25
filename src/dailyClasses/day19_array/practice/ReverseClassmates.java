package dailyClasses.day19_array.practice;

public class ReverseClassmates {

        public static void main(String[] args) {

        String[] classmates = {"John","Ed", "Jessica", "Tim", "Batu", "Igor", "Peter"};

        for (int i = 0; i < classmates.length; i++) {

            String reverse="";
            String name = classmates[i];

                for (int j = 0; j < classmates[i].length(); j++) {
                    reverse+=name.charAt(name.length()-1-j);
            }

            System.out.println(reverse);

        }





    }

}