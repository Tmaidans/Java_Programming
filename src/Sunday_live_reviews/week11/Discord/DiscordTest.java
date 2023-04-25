package Sunday_live_reviews.week11.Discord;

import replits.test2;

import java.time.LocalDate;

public class DiscordTest {

    public static void main(String[] args) {

        DiscordUser testUser = new DiscordUser("Tester","Tim",2222, LocalDate.now());

        System.out.println(testUser);
        testUser.sendMessage();
        testUser.joinDiscord("www.discord.com");

        System.out.println("-----------------------------------------------------------------");

        Admin testAdmin = new Admin("Tim",3342);
        testAdmin.sendMessage();
        testUser.joinDiscord("www.discordurl..com");
        System.out.println(testAdmin);

        System.out.println("-----------------------------------------------------------------");

        
    }

}
