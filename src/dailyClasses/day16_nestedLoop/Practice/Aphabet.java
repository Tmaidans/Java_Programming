package dailyClasses.day16_nestedLoop.Practice;

public class Aphabet {

    public static void main(String[] args) {



        for (char i = 'A'; i <= 'E'; i++) {



            System.out.println();

                 for (char j = 'a'; j <= 'z'; j++) {

            String chars = "";
            chars+=i;
            chars+=j+" ";
                     System.out.print(chars);



            }


        }



    }
}


