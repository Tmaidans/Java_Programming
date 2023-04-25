package dailyClasses.day26_statics;

public class TestIPhoneObjects {

    public static void main(String[] args) {

    IPhone iPhone = new IPhone("iPhone 12","Black",1000);

        System.out.println(iPhone.color);
        System.out.println(iPhone.price);
        System.out.println(iPhone.model);

        System.out.println("--------------------------------");

    iPhone.printPhoneInfo();

        System.out.println(iPhone.brand);//better to use IPhone class name not created object.
        System.out.println(iPhone.OS);



    }

}
