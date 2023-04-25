package Sunday_live_reviews.week4;

/*

SmsParts [substring, indexOf]

	Create a program that will has a message String in this exact format:

		Sender: <NAME>. From number: [NUMBER]. Message: {MESSAGE}

	The content of name, number and message can vary, so based on the format extract those parts and output them.

	Ex:
	Sender: <Omer Karahan>. From Number: [202-123-3456]. Message: {I love programming and problem solving}

	Output:
		Sender: Omer Karahan
		Number: 202-123-3456
		Message: I love programming and problem solving

 */

public class SmsParts {

    public static void main(String[] args) {

        String message = "Sender: <Karahan>. From Number: [202-123-3456]. Message: {I love programming and problem solving}";

        String sender, number, message2;

        int arr = message.indexOf('<')+1,
                arr2 = message.indexOf('>');
        sender = message.substring(arr,arr2);


        int brack = message.indexOf('[')+1,
                brack2 = message.indexOf(']');
        number = message.substring(brack,brack2);


        int sq = message.indexOf('{')+1,
                sq2 = message.indexOf('}');
        message2 = message.substring(sq,sq2);

        System.out.println("Sender: " + sender);
        System.out.println("Number: " + number);
        System.out.println("Message: " + message2);

    }

}
