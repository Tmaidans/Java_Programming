package dailyClasses.day06_ifStatements;

public class GradeLevel2 {

    public static void main(String[] args) {

        int gradeLevel = 7;
        Boolean elementary = gradeLevel >= 1 && gradeLevel <= 5,
                middle = gradeLevel >= 6 && gradeLevel <= 8,
                high = gradeLevel >= 9 && gradeLevel <= 12,
                college = gradeLevel >= 13 && gradeLevel <= 16,
                gradSchool = gradeLevel >= 17 && gradeLevel <= 18;

        String result = ""; //temporary value

        if (elementary) {

           result = "Elementary School";
        }

        if (middle) {

            result = "Middle School";

        }
        if (high) {

            result = "High School";

        }
        if (college) {

           result = "College";

        }
        if (gradSchool) {

            result = "Grad School";

        }

        System.out.println(result);

    }

    }

