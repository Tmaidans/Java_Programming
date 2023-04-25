package officeHours.officeHoursWeek11Tasks;

public class Entree extends FoodCourse{

    public char portionSize;

    public Entree(String name, double price, char portionSize) {
        super(name, price);
        this.portionSize = portionSize;
    }

    @Override
    public String toString() {
        return
                super.toString()+
                "portionSize=" + portionSize
                ;
    }
}
