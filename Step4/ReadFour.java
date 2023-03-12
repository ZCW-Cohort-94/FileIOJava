package Step4;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class ReadFour
{
    /**
     * Yes, you can look at the other
     * examples in this lab to build your solution here.
     *
     * @return
     */
        public static int main(String[] args) throws FileNotFoundException {
            int totalFiles = 0;
            Scanner fileIn = new Scanner(new File("input.txt"));
            while (fileIn.hasNext());{
                totalFiles++;

        }
        return totalFiles;


            // Print out a running total of all the
            // values in the input file.
        }
}