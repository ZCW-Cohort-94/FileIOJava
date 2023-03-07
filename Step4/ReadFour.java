package Step4;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{

    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {
            try{
                Scanner fileIn = new Scanner(new File("/Users/jake/Desktop/Projects/FileIOJava/Step4/input.txt"));
                int Sum = 0;

                while(fileIn.hasNext()){
                    String lineIn = fileIn.nextLine();
                    Sum += Integer.parseInt(lineIn);
                    System.out.println("Running value: " + Sum);
                }
            } catch (IOException e) {
                System.out.println("File not found");
            }
            // Print out a running total of all the
            // values in the input file.
        }
}