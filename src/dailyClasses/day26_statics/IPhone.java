package dailyClasses.day26_statics;

public class IPhone {

    public static String brand = "Apple"; //static APPLE is a brand for all iphone objects
    public String model;
    public String color;
    public double price;
    public static String OS = "iOS"; // static: operating system is same for all iphones
    public static String madeIn ="China";
    public static Boolean hasBattery = true;
    public static Boolean hasTouchScreen = true;

    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void printPhoneInfo(){ //static only accepts statics
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }

    public static void printOperatingSystem(){
        System.out.println("Operaing System");
    }

}
