package dailyClasses.day08_ternaries_switch;

public class SwitchStatementIntro2 {

    public static void main(String[] args) {

        int n = 5;

        String day;

        switch (n){

            case 1:
                day= "Monday";
                break;

            case 2:
                day= "Tuesday";
                break;

            case 3:
                day= "Wednesday";
                break;
            case 4:
                day= "Thursday";
                break;
            case 5:
                day= "Friday";

            case 6:
                day= "Saturday";
                break;
            case 7:
                day= "Sunday";
                break;
            default:
                day = "Not Valid Day";
                break;

        }

        System.out.println(day);



    }
}
