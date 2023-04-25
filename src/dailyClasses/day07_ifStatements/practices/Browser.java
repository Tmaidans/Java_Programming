package dailyClasses.day07_ifStatements.practices;

/*

2. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if


 */

public class Browser {

    public static void main(String[] args) {

        String browserName = "safari";

        String selectedBrowser ="Your selected broswer is: ";
        String browser="";

        if (browserName == "chrome" || browserName == "firefox" || browserName == "opera" || browserName == "safari"
                || browserName == "edge"){

   /*         selectedBrowser +=browserName;

            System.out.println(selectedBrowser); */

            if (browserName == "chrome"){
                browser = "Chrome Browser is selected";
            }else if (browserName == "firefox"){
                browser = "Firefox Browser is selected";
            }else if (browserName == "opera"){
                browser = "Opera Browser is selected";
            }else if (browserName == "safari"){
                browser = "Safari Browser is selected";
            }else{
                browser = "Edge Browser is selected";
            }

            System.out.println(browser);
        }else{
            System.out.println("Invalid Browser Selected");
        }









    }
}
