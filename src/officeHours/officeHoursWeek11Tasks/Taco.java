package officeHours.officeHoursWeek11Tasks;

public class Taco extends Entree{

    public String shellType;

    public Taco(String name, double price, char portionSize, String shellType) {
        super(name, price, portionSize);
        this.shellType = shellType;
    }

    @Override
    public String toString() {
        return  super.toString() +
                 " shellType= '" + shellType + '\'' +
                '}';
    }
}
