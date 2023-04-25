package Sunday_live_reviews.week9;

import java.util.ArrayList;
import java.util.Arrays;

public class HobbyTest {

    public static void main(String[] args) {

        Hobby golf = new Hobby("golf", 1000, true, false);
        Hobby puzzles = new Hobby("puzzles", 50, false, true);
        Hobby photo = new Hobby("photo", 10000, true, false);
        Hobby music = new Hobby("music", 400, true, false);

        ArrayList<Hobby> listOfHobbies = new ArrayList<>();

        listOfHobbies.addAll(Arrays.asList(golf, puzzles, photo, music));

        System.out.println(listOfHobbies);

        for (Hobby eachHobby : listOfHobbies) {

            eachHobby.doIt();

        }

        ArrayList<Hobby> indoorHobbies = new ArrayList<>(listOfHobbies);
        ArrayList<Hobby> aloneHobby = new ArrayList<>(listOfHobbies);
        ArrayList<Hobby> inExpensive = new ArrayList<>(listOfHobbies);


        indoorHobbies.removeIf(p -> p.isOutdoors);
        System.out.println("indoorHobbies = " + indoorHobbies);
        aloneHobby.removeIf(p -> p.requiresOthers);
        System.out.println("aloneHobby = " + aloneHobby);
        inExpensive.removeIf(p -> p.annualCost > 500);
        System.out.println("inexpensive = " + inExpensive);
        System.out.println(listOfHobbies);

    }

}
