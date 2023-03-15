package Step3;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadThree
{
    public static void main (String[] args)
    {
        try{
            System.out.print("Writing to file ... ");
            // Create the file to write to
            PrintWriter fileOut = new PrintWriter("src/main/java/Step3/output.txt");
            // Write text just like we would to the console
            fileOut.println("Hello ");
            // Close out file
            System.out.println("Done!");
            fileOut.close();


            
            // Read in file to verify it
            Scanner fileIn = new Scanner(new File("src/main/java/Step3/output.txt"));
            
            System.out.println("Reading from file ... ");
            while (fileIn.hasNext()) 
            {
                String lineIn = fileIn.nextLine(); 
                System.out.println(lineIn);
            }
            System.out.println("Done!");
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
