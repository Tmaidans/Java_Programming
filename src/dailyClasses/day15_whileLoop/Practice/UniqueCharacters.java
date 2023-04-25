package dailyClasses.day15_whileLoop.Practice;

public class UniqueCharacters {

    public static void main(String[] args) {

        String input = "aabcccd";
        String output="";


        for (int i = 0; i < input.length(); i++) {
            char charOne = input.charAt(i);

            for (int j = 1; j < input.length(); j++) {

                if (input.charAt(j)==charOne){


            }

                }

        }

        System.out.println(output);

    }
}
