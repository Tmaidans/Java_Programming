package officeHours.officeHoursWeek12Tasks.superHero;

public class DC extends SuperHero{

    String city;

    public DC(String heroName, String realName,  String[] powers, String city) {
        super(heroName, realName, "DC", powers);
        this.city = city;
    }

    @Override
    void protect() {
        System.out.println(heroName + " protecting with honor");
    }
}
