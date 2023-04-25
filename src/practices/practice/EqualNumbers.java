package practices.practice;

/*

7. Create a class named EqualNumbers, and write a program that can check the equality of the three given numberrs
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal

 */

public class EqualNumbers {

    public static void main(String[] args) {

        int n1 = 1,
                n2 = 1,
                n3 = 2;

        String result = "";

        if (n1 == n2 && n1!=n3 ) {
            result = n1 + " and " + n2 + " are equal";
        }
        if (n2 == n3 && n2!=n1) {
            result = n2 + " and " + n3 + " are equal";
        }
        if (n3 == n1 && n3!=n2) {
            result = n3 + " and " + n1 + " are equal";
        }
        if (n2 == n3 && n2 == n1 && n1 == n3) {
            result = "all numbers are equal";
        }
        if (n2 != n3 && n2 != n1 && n1!=n3) {
            result = "none of them are equal";
        }

        System.out.println(result);

    }

}
