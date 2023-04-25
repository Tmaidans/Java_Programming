package officeHours.officeHoursWeek08Tasks;

/*

T4LongestPalindrome [array, loop, String]

    Create a program that will define a String array of words. Find the longest palindrome String from that array. If no palindrome is found print: No Palindrome Found

    Ex:
        {java, long word, civic, apple, racecar, mom, anna, really long word}
        the longest palindrome is: racecar

        {abc, hello, world, java}
        No Palindrome Found


 */

public class T4LongestPalindrome {

    public static void main(String[] args) {

        String[] string = {"java", "long word", "civic", "apple", "racecar", "mom", "anna", "really long word" };

        String longestWord = "";
        for (String each : string) {

            if (each.equals(utilities.StringUtility.reverse(each)) && each.length() > longestWord.length()) {
                longestWord = each;
            }

        }

        System.out.println("longestWord = " + longestWord);
    }

}
