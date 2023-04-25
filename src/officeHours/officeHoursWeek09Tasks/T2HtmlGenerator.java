package officeHours.officeHoursWeek09Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class T2HtmlGenerator {

    public static void main(String[] args) {

        String input = "ul1;li3;button2";

        String[] inputArray = input.split(";");

        for (String each : inputArray) {

            int repeatTimes = Integer.parseInt("" + each.charAt(each.length() - 1));
            String html = "<" + each.substring(0, each.length() - 1) + "> </" + each.substring(0, each.length() - 1) + ">";
            html = html.concat("\n").repeat(repeatTimes);
            System.out.print(html);

        }



    }

}
