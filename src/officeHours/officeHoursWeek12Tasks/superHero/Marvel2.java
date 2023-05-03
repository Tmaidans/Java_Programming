package officeHours.officeHoursWeek12Tasks.superHero;

import java.util.ArrayList;

public class Marvel2 extends SuperHero2 {
    /*
        Create a class Marvel
        inherits SuperHero
        make Marvel

        create a constructor to initialize all the variables by calling the super class constructor
            set universe to "Marvel"

        create a method callAvengers()
            print: Calling all avengers

        override the protect method()
            print: super_hero protecting by any means necessary
     */

    public Marvel2(String superHeroName, String realName, ArrayList<String> powers) {
        super(superHeroName, realName, powers);
    }

    public void callAvengers() {
        System.out.println("Calling all avengers");
    }

    @Override
    public void protect() {
        super.protect();
        System.out.println("by any means necessary");
    }
}