package dailyClasses.day27_accessModifiers;

public class TestNestedClassObjects {

    public static void main(String[] args) {

        Car obj1 = new Car(); // Car object, from outer clas
        Car.CarEngine obj2 = obj1.new CarEngine(); //inner class

        Car.StaticInnerClass obj3 = new Car.StaticInnerClass(); //static inner class
    }

}
