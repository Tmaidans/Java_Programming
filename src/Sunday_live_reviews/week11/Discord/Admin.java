package Sunday_live_reviews.week11.Discord;

import java.time.LocalDate;

public class Admin extends DiscordUser {


/*
	Create a class Admin

	    - Admin class inherits DiscordUser class

	    - create constructor to call parent constructor and set up variables (role - Admin, name, id)
*/

    public Admin(String name, int id) {
        super("Admin", name, id);
    }


/*
	    - create method:
	        createChannel()
	            Example output: prints Creating new discord channel
*/

    public void creatChannel(){
        System.out.println("Creating new discord channel");
    }

/*
  	    - override the sendMessage() to print: "Sending announcement"
*/

    public void sendMessage(){
        System.out.println("Sending announcement");
    }

    @Override
    public String toString() {
        return "Admin{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
