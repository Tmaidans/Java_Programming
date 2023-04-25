package officeHours.officeHoursWeek04Tasks;

/*
Create a program that will define a String variable of the habitat you want information on. We should get back information about the animals that can be found in those habitats

	use the following data and make creative messages for the outputs
		habitat - animals
		grasslands - goats, bison, badgers, coyotes
		jungle	- snakes, tigers, gorillas, rhinos, toucans
		city	- dogs, cats, gulls, squirrels
		safari - lion, hippo, giraffe, zebras, elephants

		Ex:
			input:
				jungle
			output:
				In the jungle you will be able to find: snakes, tigers, gorillas, rhinos, toucans
 */

public class T3Habitat {

    public static void main(String[] args) {

        String habitat="grasslands";

        String message = "In the " + habitat + " you will be able to find: ";

            switch (habitat){

                case "grasslands":
                   message+= "goats, bison, badgers, coyotes";
                    break;

                case "jungle":
                    message += "snakes, tigers, gorillas, rhinos, toucans";
                    break;

                case "city":
                    message += "dogs, cats, gulls, squirrels";
                    break;

                case "safari":
                    message += "lion, hippo, giraffe, zebras, elephants";
                    break;


            }

        System.out.println(message);


    }

}
