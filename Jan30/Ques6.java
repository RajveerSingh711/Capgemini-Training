package Jan30;

/*Write a program that uses FileReader and BufferedReader to read a file and count how many times a specific word appears in the file.
Approach:
Create a FileReader to read from the file and wrap it in a BufferedReader.
Initialize a counter variable to keep track of word occurrences.
For each line in the file, split it into words and check if the target word exists.
Increment the counter each time the word is found.
Print the final count.
*/

import java.util.*;
import java.io.*;

public class Ques6 {
    public static void main(String[] args){
        String filePath="src/Jan30/sample.txt";
        String target="Java";
        int cnt=0;
        try(
                FileReader fr=new FileReader(filePath);
                BufferedReader br=new BufferedReader(fr);
        ){
            String line;
            while((line=br.readLine())!=null){
                String[] words=line.split("\\W+");
                for (String word:words){
                    if(word.equalsIgnoreCase(target)) cnt++;
                }
            }
            System.out.println("The word \""+target+"\" appears "+cnt+" times.");
        }catch(IOException e){
            System.out.println("Error reading file: "+e.getMessage());
        }
    }
}
