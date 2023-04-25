package officeHours.officeHoursWeek11Tasks;

public class Fish extends  Entree{

    public String fishType;

    public Fish(String name, double price, char portionSize, String fishType) {
        super(name, price, portionSize);
        this.fishType = fishType;
    }

    @Override
    public String toString() {
        return super.toString() +
                " fishType='" + fishType + '\'' +
                '}';
    }
}
