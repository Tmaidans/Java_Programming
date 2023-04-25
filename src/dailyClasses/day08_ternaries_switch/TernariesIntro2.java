package dailyClasses.day08_ternaries_switch;

public class TernariesIntro2 {

    public static void main(String[] args) {

        int number = -1;

/*
        String result;
        if (number > 0) {
            result = "positive";
        } else if (number < 0) {
            result = "negative";
        }else{
            result = "zero";
        }

        System.out.println(result);
         */

        String result = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";

        System.out.println(result);

        System.out.println("----------------------------------------------------------------");

        int n = 7;

/*
        String day = "";

        if (n == 1) {
            day = "Monday";
        } else if (n == 2) {
            day = "tuesday";
        } else if (n == 3) {
            day = "wednesday";
        } else if (n == 4) {
            day = "thursday";
        } else if (n == 5) {
            day = "friday";
        } else if (n == 6) {
            day = "saturday";
        } else {
            day = "sunday";
        }

 */

        String day = (n == 1) ? "Monday" : (n == 2) ? "tuesday" : (n == 3) ? "wednesday" : (n == 4) ? "thursday" : (n == 5) ? "friday"
                : (n == 6) ? "saturday" : "sunday";

        System.out.println(day);

        System.out.println("--------------------------------------------------------------------------");

        int num = 1; // 1~12

        String month = (num==1) ? "January" :(num==2)? "Febryary" :(num==3)? "March" :(num==4)? "April" :(num==5)? "May"
        :(num==6)? "June" :(num==7)? "July" :(num==8)? "Aug" :(num==9)? "Sept":(num==10)? "Oct" :(num==11)? "Nov" : "Dec";

        System.out.println(month);
    }
}
