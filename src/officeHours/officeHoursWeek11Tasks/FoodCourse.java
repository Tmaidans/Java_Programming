package officeHours.officeHoursWeek11Tasks;

public class FoodCourse {

public String name;
public double price;

    public FoodCourse(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
