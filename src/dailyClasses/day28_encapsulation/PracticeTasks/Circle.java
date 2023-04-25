package dailyClasses.day28_encapsulation.PracticeTasks;

public class Circle {

    private double radius;

    public static double pi;

    static {
        pi = 3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            System.err.println("Sorry radius cannot be negative or 0");
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double calcArea() {
        double area = pi * radius * radius;
        return area;
    }

    public double calcPerimeter() {
        double perimeter = 2 * pi * radius;

        return perimeter;
    }


    public String toString() {
        return "Circle{" +
                " radius= " + radius +
                " area = " + calcArea() +
                " perimeter= " + calcPerimeter() +
                '}';
    }
}
