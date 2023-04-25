package dailyClasses.day10_string;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadfilesWithScaner {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(Path.of("src/dailyClasses/day10_string/Test.txt"));


        System.out.println(scan.nextLine());


    }
}
