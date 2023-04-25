package dailyClasses.day16_nestedLoop;

public class NestedLoopPractice {

    public static void main(String[] args) {

        String str = "aaaabbbbccdddddexxeeeddgg";

        String result = "";


        for (int j = 0; j < str.length(); j++) { //responsible for finding a frequency of the character

            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {//compares a single char with every other char in the line
                if (str.charAt(i)==ch){
                    count++;
                }
            }

            if (count==2 && !result.contains(""+ch)){ //checks the final count of char, if the char count is 2, adds to string. also if there is a similar character, it is not added.
                result+=ch;
            }

        }

        System.out.println(result);



    }
}
