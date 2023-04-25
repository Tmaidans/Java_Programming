package dailyClasses.day28_encapsulation.PracticeTasks;

public class Square {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<0){
            System.err.println("Sorry side cannot be a negative number");
            System.exit(1);
        }

        this.side = side;
    }

    public Square(double side) {
        setSide(side);
    }

    public double calcArea(){
        double area = side*side;
        return area;
    }

    public double calcPerimeter (){
        double perimeter = 4*side;
        return perimeter;
    }


    public String toString() {
        return "Square{" +
                "side= " + side +
                " area= " + calcArea()+
                " perimeter = " + calcPerimeter()+
                '}';
    }
}
