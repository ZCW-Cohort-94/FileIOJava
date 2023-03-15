package Step4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class ReadFour
{

    public static void main(String[] Args){

        try{
        Scanner fileIn = new Scanner(new File("src/main/java/Step4/input.txt"));

        System.out.println("Reading from file ... ");
       int sum = 0;
        while (fileIn.hasNext()) {
            String lineIn = fileIn.nextLine();
            System.out.println(lineIn);
            sum += Integer.parseInt(lineIn);
        }

        System.out.println("Done!");
            System.out.println("Total is "+ sum);

         }

        catch (IOException e) {
    System.out.println("File not found");
        }


    }



}

