package practices.practice;

/*

4. Create a class named ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

	Note: Do not use more than one print statement

 */

public class ChooseLanguage {

    public static void main(String[] args) {

        int selection = 3;

        String printSelected = "";

        if (selection == 1) {
            printSelected = "Hello, thank for your call";
        }

        if (selection == 2) {
            printSelected = "Hola, gracias para llamar";
        }

        if (selection == 3) {
            printSelected = "Merhaba, aradiginiz icin tesekkurler";
        }

        if (selection == 4) {
            printSelected = "Privet, spasibo za vash zvonok";
        }

        if (selection == 5) {
            printSelected = "Merci ,pour votre appel";
        }

        System.out.println(printSelected);

    }
}
