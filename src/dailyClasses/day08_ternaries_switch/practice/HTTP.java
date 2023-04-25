package dailyClasses.day08_ternaries_switch.practice;

/*

8. HTTP is the protocol that governs communications between web-servers and web clients.
Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable


         declare an int variable called statusCode, and a valid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

        Solution 1: Must use ternary
		Solution 2:	MUST use switch statement

 */

public class HTTP {

    public static void main(String[] args) {


        int statusCode = 304;

        String message;

        message = (statusCode == 200) ? "OK" :(statusCode==201)? "Created" :(statusCode==202)? "Accepted" :(statusCode==301)?
                "Moved Permanently" :(statusCode==303)? "see other" : "Not Modified";

        System.out.println(message);

        System.out.println("------------------------------------------------------------------------------------------------");

    String message2="";

        switch (statusCode) {

            case 200:
                message2 += "OK";
                break;

            case 201:
                message2 += "Created";
                break;

            case 202:
                message2 += "Accpeted";
                break;

            case 301:
                message2 += "Moved Permanently";
                break;

            case 303:
                message2 += "See other";
                break;


        }

        System.out.println(message2);

    }

}
