package Jan30;

/*Write a program that uses InputStreamReader to read user input from the console and write the input to a file. Each input should be written as a new line in the file.
Approach:
Create an InputStreamReader to read from System.in (the console).
Wrap the InputStreamReader in a BufferedReader for efficient reading.
Create a FileWriter to write to the file.
Read user input using readLine() and write the input to the file.
Repeat the process until the user enters "exit" to stop inputting.
Close the file after the input is finished.
*/

import java.util.*;
import java.io.*;

public class Ques8 {
    public static void main(String[] args){
        String filePath="src/Jan30/sample1.txt";
        try(
                InputStreamReader isr=new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(isr);
                FileWriter fw=new FileWriter(filePath);
                ){
            System.out.println("Enter text (type 'exit' to stop):");
            String input;
            while((input=br.readLine())!=null){
                if(input.equalsIgnoreCase("exit")) break;
                fw.write(input);
                fw.write(System.lineSeparator());
            }
            System.out.println("✅ Input successfully written to file!");
        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
