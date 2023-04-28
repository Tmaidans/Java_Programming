package officeHours.officeHoursWeek12Tasks.superHero;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckHeroes {

    public static void main(String[] args) {

    Marvel hero1 = new Marvel("Spider Man","Peter Parker", new ArrayList<>(Arrays.asList("Enhanced strength", "agility", "spider-sense")));

       hero1.protect();
       hero1.callAvengers();
        System.out.println(hero1);

        System.out.println("-----------------------------------------------------------------------------------------------");

    DC hero2 = new DC("Batman","Bruce Wayne", new ArrayList<>(Arrays.asList("master detective", "martial arts", "technical tools")),"Gotham");

    hero2.protect();
        System.out.println(hero2);

        System.out.println("-----------------------------------------------------------------------------------------------");

        SuperHero2 hero3 = new SuperHero2("Spidey","Timmy",new ArrayList<>(Arrays.asList("master detective", "martial arts", "technical tools")));
        System.out.println(hero3);

        SuperHero2 hero4 = new SuperHero2("Battyy","jiffy",new ArrayList<>(Arrays.asList("jerking", "martial arts", "technical tools")));
        System.out.println(hero4);

    }


}
