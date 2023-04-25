package practices.practice;

/*

CellPhone [variables, concatenation]

	Declare and assign the following variables:
		brand, model, color, price, storage, has camera, sim type (A, B, or C)

	Print out an advertisement post about the phone in this format:
		-> For extra practices.practice also create this advertisement in a reusable way

		ex: if the given data was this: Apple, IPhone X, Black, 1200.99, 128, true, A
		the output would be:

		We have an brand new IPhone X from Apple
		It comes in the color Black and has 128GB memory
		It has a camera and operates with the "A" type sim
		Get your very own IPhone X for only $1200.99

 */
public class CellPhone {

    public static void main(String[] args) {

        String brand = "Apple",
                model = "Iphone X",
                color = "Black";
        char simType = 'A';
        double price = 1200.99;
        int storage = 128;
        boolean hasCamera = true;
        String advert = "We have a brand new " + model + " from " + brand +
                "\nIt comes in color " + color + " and has " + storage + "GB memory" +
                "\nIt has camera: " + hasCamera + " and operates with the \"" + simType + "\" type sim";

        System.out.println(advert);


        char a = 'a';
        char b = 65;

        System.out.println((int)a);
        System.out.println((int)b);

        System.out.println(3%5);


    }

}
