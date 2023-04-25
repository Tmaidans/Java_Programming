package practices.practice;

/*

5. Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the chracters on ASCII table

 */

public class CharacterIdentity {

    public static void main(String[] args) {

        char givenNumber = '%';
        String answer = "";
        boolean special = givenNumber >= 32 && givenNumber <= 47 || givenNumber >= 58 && givenNumber <=64 || givenNumber >=91 && givenNumber<=96 || givenNumber >=123 && givenNumber <=127,
                number = givenNumber >= 48 && givenNumber <=57,
                letter = !special && !number;



        if (special) {
            answer = "Special Character";
        }
        if (number){
            answer = "Number";
        }
        if (letter){
            answer = "Letter";
        }

        System.out.println(answer);


    }


}
