package dailyClasses.day16_nestedLoop;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String str = "aaabaaaaaabbbccccaaaaac";
        char ch1 = 'a';
        int number =0;

        for (int i = 0; i < str.length(); i++) {

            if ((""+str.charAt(i)).equals(""+ch1)){
                number+=1;
            }

        }

        System.out.println(number);

    }
}
