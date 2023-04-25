package dailyClasses.day24_dateAndTime.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class CountryNames {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Afghanistan","Antigua and Barbuda", "Bangladesh","Barbados",
                "Cambodia","Costa Rica","Denmark", "Ecuador","Finland", "Guyana","Guinea-Bissau"));

        list.removeIf(p->p.length()>10);

        System.out.println(list);




    }

}
