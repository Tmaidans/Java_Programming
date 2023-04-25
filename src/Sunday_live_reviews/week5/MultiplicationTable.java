package Sunday_live_reviews.week5;

/*

Multiplication Table [methods, loops]

	create a method that will accept a number. Print the multiplication table for the give number up until 10

	print the results in this format:
		$number x 1 = result
		$number x 2 = result
		...
		$number x 10 = result

		ex:
			number = 4
			4 x 1 = 4
			4 x 2 = 8
			...

 */

public class MultiplicationTable {

    public static void main(String[] args) {

        multiplication(5);

    }

    public static int multiplication(int num) {

        System.out.println("number = " + num);

        int multiplication = 0;

        for (int i = 1; i <= 10; i++) {
            multiplication = num * i;
            System.out.println(num + " * " + i + " = " + multiplication);
        }

        return num;


    }

    public static int multiplication(int num, int range) {

        System.out.println("number = " + num);

        int multiplication = 0;

        for (int i = 1; i <= range; i++) {
            multiplication = num * i;
            System.out.println(num + " * " + i + " = " + multiplication);
        }

        return multiplication;


    }


}

