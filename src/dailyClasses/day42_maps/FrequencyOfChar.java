package dailyClasses.day42_maps;


import java.util.*;

public class FrequencyOfChar {

    public static void main(String[] args) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        String str = "bbcccaaaaa";

        String[] strArray = str.split("");
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(strArray));

        for (String each : strList) {
            map.put(each.charAt(0),(Collections.frequency(strList, each)));
        }

        System.out.println(map);





    }

}
