package Sunday_live_reviews.week6;

public class PrimeInRange {

    public static void main(String[] args) {

        System.out.println(range(13));

    }


    public static String range(int range) {
        String result = "2";

        for (int i = 2; i <= range; i++) {
            int testNumber = i;
            if (testNumber % 2 == 0) {
                continue;

            }
            for (int j = 3; j <= testNumber; j++) {

                if ((testNumber % j == 0) && (testNumber != j)) {
                    break;
                } else if (!(testNumber % j == 0) && (testNumber != j)) {
                    continue;
                } else {
                    result += " " + testNumber;
                }

            }

        }
        return result;
    }

}
