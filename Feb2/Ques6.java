package Feb2;

/*Create a program that reads a text file and writes its contents into another file, converting all uppercase letters to lowercase.
Requirements:
Use FileReader and FileWriter.
Use BufferedReader and BufferedWriter for efficiency.
Handle character encoding issues.
*/

import java.io.*;
import java.util.*;

public class Ques6 {
    public static void main(String[] args){
        String sourceFile="input.txt";
        String destinationFile="output.txt";
        try(
                BufferedReader br=new BufferedReader(new FileReader(sourceFile));
                BufferedWriter bw=new BufferedWriter(new FileWriter(destinationFile))
        ){
            int ch;
            while((ch=br.read())!=-1) bw.write(Character.toLowerCase((char) ch));
            System.out.println("File copied successfully with lowercase conversion.");
        }catch(IOException e){
            System.out.println("Error while processing the file.");
            e.printStackTrace();
        }
    }
}
