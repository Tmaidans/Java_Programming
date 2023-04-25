package Sunday_live_reviews.week4;

/*

Url [Scanner, String methods, conditional]

	Create a program that will allow the user to enter a url. The program will verify if the given url is valid and if it is print the domain name

	A url is valid if it has "www." in the beginning and has either .com, .org, .edu. or .gov at the end

	If the url is valid print the domain name part: $url is a valid url for google

		ex: www.google.com
			www.google.com is a valid url for google

	If the url is not valid print the reason it is not valid:

		ex: amazon.com
		Sorry, amazon.com is not valid because it is missing these:
			www. in the beginning

		ex: youtube
		Sorry, youtube is not valid because it is missing these:
			www. in the beginning
			.com, .org, .edu, or .gov in the end

 */

import java.util.Scanner;

public class Url {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please provide URL:");
        String url = input.nextLine();

        String domain;
        boolean wwwValid = url.toLowerCase().contains("www.");
        boolean domainValid = url.toLowerCase().contains(".com") || url.toLowerCase().contains(".org") || url.toLowerCase().contains(".edu") || url.toLowerCase().contains(".gov");

        if (wwwValid && domainValid) {

            int first = url.indexOf('.');
            int last = url.lastIndexOf('.');
            domain = url.substring(first + 1, last);

            System.out.println(url + " is a valid url for " + domain);

        } else if (!wwwValid && domainValid) {

            System.out.println(url + " not valid because it is missing these: \nwww. in the beginning");

        } else {

            System.out.println(url + " not valid because it is missing these: \nwww. in the beginning" +
                    "\n.com, .org, .edu, or .gov in the end");

        }


        input.close();

    }

}
