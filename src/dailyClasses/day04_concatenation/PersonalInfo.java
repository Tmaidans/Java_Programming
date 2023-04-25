package dailyClasses.day04_concatenation;

public class PersonalInfo {

    /*
    Warmup task:
	1. Create a class named PersonalInfo, and declare the variables with the appropriate for the followings:
			1. first name
			2. last name
			3. gender
			4. age
			5. from
			6. favorite music
			7. favorite book
			8. favorite show
			9. favorite color
			10. married status
			11. employee status

     */

    public static void main(String[] args) {

        String firstName = "Tim",
                lastName = "Maidans",
                from = "Riga - Latvia",
                favoriteMusic = "Rap",
                favoriteBook = "Harry Potter",
                favoriteTvShow = "Doctor Who",
                favoriteColor = "Black";
        char gender = 'M';
        int age = 35;
        boolean marriedStatus = true,
                employeeStatus = true;

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("from = " + from);
        System.out.println("favoriteMusic = " + favoriteMusic);
        System.out.println("favoriteBook = " + favoriteBook);
        System.out.println("favoriteTvShow = " + favoriteTvShow);
        System.out.println("favoriteColor = " + favoriteColor);
        System.out.println("married = " + marriedStatus);
        System.out.println("employeeStatus = " + employeeStatus);


    }


}
