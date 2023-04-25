package Sunday_live_reviews.week11.Discord;


import java.time.LocalDate;

public class DiscordUser {

    /*
iscordUser [Inheritance, overriding, super constructor, LocalDate]

	Create an DiscordUser class

	    - create variables:
	        role, name, id
	        variable: account creation date

     */

    public String role;
    public String name;
    public int id;
    public LocalDate accountCreation;


/*
	    - create constructor to initialize the variables
*/

    public DiscordUser(String role, String name, int id, LocalDate accountCreation) {
        this.role = role;
        this.name = name;
        this.id = id;
        this.accountCreation = accountCreation;
    }

    public DiscordUser(String role, String name, int id) {
        this.role = role;
        this.name = name;
        this.id = id;
    }

    /*
	    - create a method sendMessage()
	    	prints: "Sending message to class chat"
*/

    public void sendMessage(){
        System.out.println("Sending message to class chat");
    }

/*
	    - create a method joinDiscord(String discordUrl)
	    	prints: "Joining $discordUrl"
*/

    public void joinDiscord(String discordUrl){
        System.out.println("Joining " + discordUrl);
    }

/*

	    - override toString()

*/


    public String toString() {
        return "DiscordUser{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", accountCreation=" + accountCreation +
                '}';
    }

   /*

	Create a class Student

	    - Student class inherits DiscordUser class

	    - create constructor to call parent constructor and set up variables (role - Student, name, id)

	    - overload the sendMessage(String name) to accept a String for the chat name
	    	print Sending message to $name

 */


}
