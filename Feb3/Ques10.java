package Feb2;

/*Write a Java program that counts the number of words in a given text file and displays the top 5 most frequently occurring words.
Requirements:
Use FileReader and BufferedReader to read the file.
Use a HashMap<String, Integer> to count word occurrences.
Sort the words based on frequency and display the top 5.
*/

import java.io.*;
import java.util.*;

public class Ques10 {
    public static void main(String[] args){
        String filePath="input.txt";
        HashMap<String,Integer> wordCount=new HashMap<>();
        try(BufferedReader br=new BufferedReader(new FileReader(filePath))){
            String line;
            while((line=br.readLine())!=null){
                String[] words=line.toLowerCase().split("\\W+");
                for(String word:words){
                    if(!word.isEmpty()){
                        wordCount.put(word,wordCount.getOrDefault(word,0) +1);
                    }
                }
            }
        }catch(IOException e){
            System.out.println("Error reading the file.");
            e.printStackTrace();
            return;
        }
        List<Map.Entry<String, Integer>> list=new ArrayList<>(wordCount.entrySet());
        list.sort((a,b)->b.getValue().compareTo(a.getValue()));
        System.out.println("Top 5 most frequent words:");
        for(int i=0;i<Math.min(5,list.size());i++){
            System.out.println((i+1)+". "+list.get(i).getKey()+" -> "+list.get(i).getValue());
        }
    }
}
