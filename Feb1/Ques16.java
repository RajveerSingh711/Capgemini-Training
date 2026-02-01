package Feb1;

/*Word Frequency Counter
Read a text file and count the frequency of each word using a HashMap. Ignore case and punctuation.
Example:
Input: "Hello world, hello Java!" → Output: {hello=2, world=1, java=1}
 */

import java.util.*;
import java.io.*;

public class Ques16 {
    static Map<String,Integer> countWordFrequency(String filePath){
        Map<String,Integer> map=new HashMap<>();
        try(BufferedReader br=new BufferedReader(new FileReader(filePath))){
            String line;
            while((line=br.readLine())!=null){
                line=line.toLowerCase().replaceAll("[^a-z0-9 ]","");
                String[] words=line.split("\\s+");
                for(String word:words){
                    if(!word.isEmpty()) map.put(word,map.getOrDefault(word,0)+1);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return map;
    }
    public static void main(String[] args){
        String filePath="src/Feb1/sample.txt";
        Map<String, Integer> result=countWordFrequency(filePath);
        System.out.println(result);
    }
}
