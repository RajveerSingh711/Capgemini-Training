package Feb2;

/*Develop a Java program that efficiently reads a large text file (500MB+) line by line and prints only lines containing the word "error".
Requirements:
Use BufferedReader for efficient reading.
Read line-by-line instead of loading the entire file.
Display only lines containing "error" (case insensitive).
*/

import java.util.*;
import java.io.*;

public class Ques9 {
    public static void main(String[] args){
        String filePath="largefile.txt";
        try(BufferedReader br=new BufferedReader(new FileReader(filePath))){
            String line;
            while((line=br.readLine())!=null){
                if(line.toLowerCase().contains("error")) System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("Error reading the file.");
            e.printStackTrace();
        }
    }
}
