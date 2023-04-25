package dailyClasses.day08_ternaries_switch.practice;

/*
9. write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary

 */

public class Browser {

    public static void main(String[] args) {

        String browserName = "dddd";

        String selectedBrowser ="Your selected browser is: ";

            switch (browserName){

                case "chrome":
                    selectedBrowser += browserName;
                    break;

                case "firefox":
                    selectedBrowser += browserName;
                    break;

                case "opera":
                    selectedBrowser += browserName;
                    break;

                case "safari":
                    selectedBrowser += browserName;
                    break;

                case "edge":
                    selectedBrowser += browserName;
                    break;

                default:
                    selectedBrowser += "INVAILD";


            }

        System.out.println(selectedBrowser);
    }
}
