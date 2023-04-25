package officeHours.officeHoursWeek08Tasks;

/*


T2BeginningEnd [array, loop, String]

    Create a program that will define a String array with some name values. Determine how many of the names begin with and end with the same character.

    Ex:
        {Anna, Mike, Aliya, Remus, Gina, Hannah, Nathan, Otto, Kevin, Kelly}

        -> 5

    Bonus challenge: Collect all the names that start and end with the same character into an array


 */


import java.util.Arrays;

public class T2BeginningEnd {

    public static void main(String[] args) {

        String[] names = {"Anna", "Mike", "Aliya", "Remus", "Gina", "Hannah", "Nathan", "Otto", "Kevin", "Kelly"};
        String selectedNames = "";
        //int output = 0;

        for (int i = 0; i < names.length; i++) {

            String each = names[i];
            if (each.toLowerCase().charAt(0) == each.charAt(each.length() - 1)) { //each.endsWith(each.sunstring(0,1).toLowerCase()
               // output += 1;
                selectedNames += each + "<>";
            }

        }
   //     selectedNames = selectedNames.trim(); not necessary
        String[] selected = selectedNames.split("<>");

        System.out.println("Selected names: " +selectedNames);
        System.out.println("Counter: " + selected.length);
        System.out.println(Arrays.toString(selected));


    }

}
