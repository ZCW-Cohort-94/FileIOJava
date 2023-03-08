package Step4;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour {
    /**
     * Yes, you can look at the other
     * examples in this lab to build your solution here.
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("/Users/dhannya/Projects/FileIOJava/Step4/input.txt"));
        int sum = 0;
        while (scan.hasNext()) {
            int lineIn = Integer.parseInt(scan.nextLine());
            sum = sum + lineIn;
            System.out.println("Running total: " + sum);
            // Print out a running total of all the
            // values in the input file.
        }
    }
}